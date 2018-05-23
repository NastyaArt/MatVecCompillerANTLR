import gen.GrammarBaseVisitor;
import gen.GrammarParser;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitor extends GrammarBaseVisitor<String> {

    List<String> errors = new ArrayList<>();
    Variables variables = new Variables();
    Map<String, String> functions = new HashMap<>();
    Map<String, GrammarParser.SignatureFunctionContext> functionSignatures = new HashMap<>();

    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx) {
        String buffer = result;
        String tempBuffer = "";
        for (GrammarParser.FunctionReturnContext context : ctx.functionReturn())
            tempBuffer += visitFunctionReturn(context);
        for (GrammarParser.FunctionNonReturnContext context : ctx.functionNonReturn())
            tempBuffer += visitFunctionNonReturn(context);
        buffer += visitBlock(ctx.block());
        buffer += "\n" + tempBuffer + "\n" + matrixClass + "\n" + vectorClass + "\n}";
        String error = "";
        if (errors.size() > 0) {
            for (String err : errors) error += err + "\n";
            JOptionPane.showMessageDialog(null, error);
        }
        return buffer;
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx) {
        variables.increase();
        String buffer = "{\n";
        for (GrammarParser.ContentContext context : ctx.content())
            buffer += visitContent(context) + "\n";
        buffer += "}";
        variables.decrease();
        return buffer;
    }

    @Override
    public String visitDeclaration(GrammarParser.DeclarationContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("matrix")) {
                errors.add("Error: variable " + ctx.NAME().getText() + " was already initialise");
            }else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("vector")) {
                errors.add("Error: variable " + ctx.NAME().getText() + " was already initialise");
            }
        } else {
            if(ctx.type().MATRIX() != null)
            {
                variables.put(ctx.NAME().getText(), "matrix");
                buffer += "Matrix " + "" + ctx.NAME().getText() + " = new Matrix();";
            }
            else {
                variables.put(ctx.NAME().getText(), "vector");
                buffer += "Vector " + "" + ctx.NAME().getText() + " = new Vector();";
            }
        }
        return buffer;
    }

    @Override
    public String visitSet(GrammarParser.SetContext ctx) {
        String buffer = "";
        for (int i = 0; i<ctx.NUMBER().size(); i++) {
            buffer += ctx.NUMBER(i).getText();
            if(i!=ctx.NUMBER().size()-1)
                buffer+=", ";
        }
        return buffer;
    }

    @Override
    public String visitIntAssignment(GrammarParser.IntAssignmentContext ctx) {
        String buffer = "";
        buffer = "int " + ctx.NAME().toString() + "=" + ctx.NUMBER().toString() + ";";
        return buffer;
    }
    @Override
    public String visitVectorAssignment(GrammarParser.VectorAssignmentContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.VECTOR() != null) {
                errors.add("Error: variable " + ctx.NAME().getText() + " already used");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("vector")) {
                errors.add("Error: variable " + ctx.NAME().getText() + " is not a vector");
            }
        } else {
            if(!ctx.VECTOR().getText().equals("vector")) errors.add("Error: unknown type of variable");
            else {
                variables.put(ctx.NAME().getText(), "vector");
                buffer += "Vector ";
            }
        }
        if (ctx.set() != null) {
            buffer += "" + ctx.NAME().getText() + " = new Vector(Arrays.asList("
                    + visitSet(ctx.set()) + "));";
        }
        return buffer;
    }

    @Override
    public String visitMatrixAssignment(GrammarParser.MatrixAssignmentContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.MATRIX() != null) {
                errors.add("Error: variable " + ctx.NAME().getText() + " already used");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("matrix")) {
                errors.add("Error: variable " + ctx.NAME().getText() + " is not a matrix");
            }
        } else {
            if(!ctx.MATRIX().getText().equals("matrix")) errors.add("Error: unknown type of variable");
            else {
                variables.put(ctx.NAME().getText(), "matrix");
                buffer += "Matrix ";
            }
        }
        if (ctx.set() != null) {
            buffer += "" + ctx.NAME().getText() + " = new Matrix(new int[][]{";
            for(int i = 0; i< ctx.set().size(); i++)
            {
                buffer += "{" + visitSet(ctx.set(i)) + "}";
                if(i!=ctx.set().size()-1)
                    buffer+=", ";
            }
            buffer += "});";
        }
        return buffer;
    }

    @Override
    public String visitAssignment(GrammarParser.AssignmentContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.type() != null) {
                errors.add("Error: variable " + ctx.NAME().getText() + " already used");
            }
        } else {
            if(ctx.type().MATRIX() != null && ctx.type().getText().equals("matrix"))
            {
                variables.put(ctx.NAME().getText(), "matrix");
                buffer += "Matrix ";
            }
            else if(ctx.type().VECTOR() != null && ctx.type().getText().equals("vector")){
                variables.put(ctx.NAME().getText(), "vector");
                buffer += "Vector ";
            }
            else errors.add("Error: unknown type of variable");
        }
        if (ctx.expression() != null)
            buffer += "" + ctx.NAME().getText() + " = " + visitExpression(ctx.expression()) + ";";
        return buffer;
    }

    @Override
    public String visitPrintFunc(GrammarParser.PrintFuncContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME().getText());
        }
        return ctx.getText();
    }

    @Override
    public String visitGetFunc(GrammarParser.GetFuncContext ctx) {
        if (variables.get(ctx.NAME(0).getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME(0).getText());
        }
        return ctx.getText();
    }

    @Override
    public String visitSetFunc(GrammarParser.SetFuncContext ctx) {
        if (variables.get(ctx.NAME(0).getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME(0).getText());
        }
        return ctx.getText();
    }
    @Override
    public String visitLengthFunc(GrammarParser.LengthFuncContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME().getText());
        }
        if (!variables.get(ctx.NAME().getText()).equals("vector")) {
            errors.add(ctx.NAME().getText() + " is not a vector");
            return "";
        }
        return ctx.getText();
    }

    @Override
    public String visitNcolFunc(GrammarParser.NcolFuncContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME().getText());
        }
        if (!variables.get(ctx.NAME().getText()).equals("matrix")) {
            errors.add(ctx.NAME().getText() + " is not a matrix");
            return "";
        }
        return ctx.getText();
    }

    @Override
    public String visitNrowFunc(GrammarParser.NrowFuncContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME().getText());
        }
        if (!variables.get(ctx.NAME().getText()).equals("matrix")) {
            errors.add(ctx.NAME().getText() + " is not a matrix");
            return "";
        }
        return ctx.getText();
    }

    @Override
    public String visitAddFunc(GrammarParser.AddFuncContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME().getText());
        }
        return ctx.getText();
    }

    @Override
    public String visitRemoveFunc(GrammarParser.RemoveFuncContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find variable " + ctx.NAME().getText());
        }
        return ctx.getText();
    }

    @Override
    public String visitInputSignature(GrammarParser.InputSignatureContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null) {
            errors.add("Error: cant find function " + ctx.NAME().getText());
        }
        if (ctx.inputSignature() != null)
            buffer += ctx.NAME().getText() + visitInputSignature(ctx.inputSignature());
        else buffer += ctx.NAME().getText()+"()";
        return buffer;
    }

    @Override
    public String visitType(GrammarParser.TypeContext ctx) {
        if (ctx.MATRIX() != null)
            return "Matrix";
        if (ctx.VECTOR() != null)
            return "Vector";
        if((ctx.MATRIX() != null && !ctx.MATRIX().getText().equals("matrix"))
                || (ctx.VECTOR() != null && !ctx.VECTOR().getText().equals("vector")))
            errors.add("Error: unknown type of variable");
        return "";
    }

    @Override
    public String visitSignatureFunction(GrammarParser.SignatureFunctionContext ctx) {
        String buffer = "(";
        for (int i = 0; i<ctx.NAME().size();i++) {
            buffer += visitType(ctx.type(i)) + " " + ctx.NAME(i).getText();
            if(i!=ctx.NAME().size()-1)
                buffer+=", ";
        }
        buffer+=")";
        return buffer;
    }

    @Override
    public String visitFunctionReturn(GrammarParser.FunctionReturnContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null)
            functions.put(ctx.NAME().getText(), visitType(ctx.type()));
        else
            errors.add("Function name " + ctx.NAME().getText() + " already used");
        buffer += "\nprivate " + visitType(ctx.type()) + " " + ctx.NAME().getText();
        if (ctx.signatureFunction() != null) {
            buffer += visitSignatureFunction(ctx.signatureFunction()) + "throws Exception";
            functionSignatures.put(ctx.NAME().getText(), ctx.signatureFunction());
        }
        else buffer += "() throws Exception";
        variables.increase();
        if (ctx.signatureFunction() != null) {
            for (int i = 0; i < ctx.signatureFunction().type().size(); i++)
                variables.put(ctx.signatureFunction().NAME(i).getText(), ctx.signatureFunction().type(i).getText());
        }
        buffer += visitBlockReturn(ctx.blockReturn());
        return buffer;
    }

    @Override
    public String visitFunctionNonReturn(GrammarParser.FunctionNonReturnContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null)
            functions.put(ctx.NAME().getText(), "void");
        else
            errors.add("Function name " + ctx.NAME().getText() + " already used");
        buffer += "\nprivate void " + ctx.NAME().getText();
        if (ctx.signatureFunction() != null) {
            buffer += visitSignatureFunction(ctx.signatureFunction()) + "throws Exception";
            functionSignatures.put(ctx.NAME().getText(), ctx.signatureFunction());
        }
        else buffer += "() throws Exception";
        variables.increase();
        if(ctx.signatureFunction() != null) {
            for (int i = 0; i < ctx.signatureFunction().type().size(); i++)
                variables.put(ctx.signatureFunction().NAME(i).getText(), ctx.signatureFunction().type(i).getText());
        }
        buffer += visitBlockNonReturn(ctx.blockNonReturn());
        return buffer;
    }

    @Override
    public String visitBlockReturn(GrammarParser.BlockReturnContext ctx) {
        String buffer = "{\n";
        for (GrammarParser.ContentContext context : ctx.content())
            buffer += visitContent(context) + "\n";
        buffer += "return " + ctx.NAME().getText() + ";" + "\n}\n";
        if (variables.get(ctx.NAME().getText()) == null)
            errors.add("Error: cant find variable " + ctx.NAME().getText() + " in return");
        variables.decrease();
        return buffer;
    }

    @Override
    public String visitBlockNonReturn(GrammarParser.BlockNonReturnContext ctx) {
        String buffer = "{\n";
        for (GrammarParser.ContentContext context : ctx.content())
            buffer += visitContent(context) + "\n";
        buffer += "return;\n}\n";
        variables.decrease();
        return buffer;
    }

    @Override
    public String visitCompareExpr(GrammarParser.CompareExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCompare(GrammarParser.CompareContext ctx) {
        if(ctx.compareOp(0).getText() == null)
            errors.add("Error: cant find " + ctx.compareOp(0).getText());
        visitCompareOp(ctx.compareOp(0));
        if(ctx.compareOp(1).getText() == null)
            errors.add("Error: cant find " + ctx.compareOp(1).getText());
        visitCompareOp(ctx.compareOp(1));
        return ctx.getText();
    }

    @Override
    public String visitElseBlock(GrammarParser.ElseBlockContext ctx) {
        return "else" + visitBlock(ctx.block());
    }

    @Override
    public String visitIfBlock(GrammarParser.IfBlockContext ctx) {
        String buffer = "";
        if (ctx.compare() != null)
            buffer += "if(" + visitCompare(ctx.compare()) + ")";
        buffer += visitBlock(ctx.block());
        if (ctx.elseBlock() != null)
            buffer += visitElseBlock(ctx.elseBlock());
        return buffer;
    }

    @Override
    public String visitWhileBlock(GrammarParser.WhileBlockContext ctx) {
        String buffer = "";
        if (ctx.compare() != null)
            buffer += "while(" + visitCompare(ctx.compare()) + ")";
        buffer += visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitForBlock(GrammarParser.ForBlockContext ctx) {
        String buffer = "";
        if(ctx.compare().getText() == null)
            errors.add("Error: cant find " + ctx.compare().getText());
        buffer += "for(" + visitIntAssignment(ctx.intAssignment()) + visitCompare(ctx.compare()) +
                "; " + ctx.NAME().getText() + "=" + ctx.intOperation().getText() + ")";
        buffer += visitBlock(ctx.block());
        return buffer;
}

    @Override
    public String visitCompareOp(GrammarParser.CompareOpContext ctx) {
        if(ctx.getFunc() != null)
            return visitGetFunc(ctx.getFunc());
        if(ctx.lengthFunc() != null)
            return visitLengthFunc(ctx.lengthFunc());
        if(ctx.nrowFunc() != null)
            return visitNrowFunc(ctx.nrowFunc());
        if(ctx.ncolFunc() != null)
            return visitNcolFunc((ctx.ncolFunc()));
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitExpression(GrammarParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            if (variables.get(ctx.getChild(0).getText()) == null ||
                    (ctx.getChild(2) == ctx.NAME() && variables.get(ctx.getChild(2).getText()) == null)) {
                errors.add("Error: cant find variable " + ctx.NAME(0).getText()
                        + "|" + ctx.NAME(1).getText());
            }
        }
        if (ctx.PLUS() != null)
            return ctx.getChild(0).getText() + ".plus(" +  ctx.getChild(2).getText() + ")";
        if (ctx.MINUS() != null)
            return ctx.getChild(0).getText() + ".minus(" +  ctx.getChild(2).getText() + ")";
        if (ctx.MULTIPLY() != null)
            return ctx.getChild(0).getText() + ".mult(" +  ctx.getChild(2).getText() + ")";
        if (ctx.functionCall() != null)
            return visitFunctionCall(ctx.functionCall());
        return "";
    }

    @Override
    public String visitContent(GrammarParser.ContentContext ctx) {
        if (ctx.vectorAssignment() != null)
            return visitVectorAssignment(ctx.vectorAssignment());
        else if (ctx.declaration() != null)
            return visitDeclaration(ctx.declaration());
        else if (ctx.matrixAssignment() != null)
            return visitMatrixAssignment(ctx.matrixAssignment());
        else if (ctx.functionCall() != null)
            return visitFunctionCall(ctx.functionCall()) + ";";
        else if (ctx.whileBlock() != null)
            return visitWhileBlock(ctx.whileBlock());
        else if (ctx.ifBlock() != null)
            return visitIfBlock(ctx.ifBlock());
        else if (ctx.assignment() != null)
            return visitAssignment(ctx.assignment());
        else if (ctx.printFunc() != null)
            return visitPrintFunc(ctx.printFunc());
        else if (ctx.addFunc() != null)
            return visitAddFunc(ctx.addFunc());
        else if (ctx.removeFunc() != null)
            return visitRemoveFunc(ctx.removeFunc());
        else if (ctx.forBlock() != null)
            return visitForBlock(ctx.forBlock());
        else if (ctx.setFunc() != null)
            return visitSetFunc(ctx.setFunc());
        else return "";
    }

    String result = "import java.util.ArrayList;\n" +
            "import java.util.Collections;\n" +
            "import java.util.List;\n" +
            "import java.util.Arrays;\n" +
            "public class Result {\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            new Result().start();\n" +
            "        } catch (Exception e) {\n" +
            "            System.err.println(e.getMessage());\n" +
            "        }\n" +
            "    }\n" +
            "    private void start() throws Exception\n";

    String matrixClass = "public class Matrix {\n" +
            "\n" +
            "    public int rows;\n" +
            "    public int columns;\n" +
            "    public int[][] array;\n" +
            "\n" +
            "    public Matrix()\n" +
            "    {\n" +
            "        rows = 0;\n" +
            "        columns = 0;\n" +
            "        array = null;\n" +
            "    }\n" +
            "\n" +
            "    public Matrix(int r, int c)\n" +
            "    {\n" +
            "        rows = r;\n" +
            "        columns = c;\n" +
            "        array = new int[r][c];\n" +
            "    }\n" +
            "\n" +
            "    public Matrix(int[][] arr){\n" +
            "        rows = arr.length;\n" +
            "        columns = arr[0].length;\n" +
            "        array = arr;\n" +
            "    }\n" +
            "\n" +
            "    public void print()\n" +
            "    {\n" +
            "        for (int i = 0; i < rows; i++) {\n" +
            "            for (int j = 0; j < columns; j++)\n" +
            "                System.out.print(array[i][j] + \" \");\n" +
            "            System.out.println();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public int get(int r, int c)\n" +
            "    {\n" +
            "        return array[r][c];\n" +
            "    }\n" +
            "\n" +
            "    public void set(int r, int c, int v)\n" +
            "    {\n" +
            "        array[r][c] = v;\n" +
            "    }" +
            "\n" +
            "    public int nrow()\n" +
            "    {\n" +
            "        return rows;\n" +
            "    }\n" +
            "\n" +
            "    public int ncol()\n" +
            "    {\n" +
            "        return columns;\n" +
            "    }" +
            "\n" +
            "    public Matrix plus(Matrix matr2)\n" +
            "    {\n" +
            "        if (this.rows != matr2.rows || this.columns != matr2.columns)\n" +
            "                throw new RuntimeException(\"Check matrix size.\");\n" +
            "        Matrix matr = new Matrix(rows,columns);\n" +
            "        for (int i = 0; i < rows; i++)\n" +
            "            for (int j = 0; j < columns; j++)\n" +
            "                matr.array[i][j] = this.array[i][j] + matr2.array[i][j];\n" +
            "        return matr;\n" +
            "    }\n" +
            "\n" +
            "public Matrix plus(int x)\n" +
            "    {\n" +
            "        Matrix matr = new Matrix(rows,columns);\n" +
            "        for (int i = 0; i < rows; i++)\n" +
            "            for (int j = 0; j < columns; j++)\n" +
            "                matr.array[i][j] = this.array[i][j] + x;\n" +
            "        return matr;\n" +
            "    }" +
            "\n" +
            "    public Matrix minus(Matrix matr2)\n" +
            "    {\n" +
            "        if (this.rows != matr2.rows || this.columns != matr2.columns)\n" +
            "            throw new RuntimeException(\"Check matrix size.\");\n" +
            "        Matrix matr = new Matrix(rows,columns);\n" +
            "        for (int i = 0; i < rows; i++)\n" +
            "            for (int j = 0; j < columns; j++)\n" +
            "                matr.array[i][j] = this.array[i][j] - matr2.array[i][j];\n" +
            "        return matr;\n" +
            "    }\n" +
            "\n" +
            "    public Matrix minus(int x)\n" +
            "    {\n" +
            "        Matrix matr = new Matrix(rows,columns);\n" +
            "        for (int i = 0; i < rows; i++)\n" +
            "            for (int j = 0; j < columns; j++)\n" +
            "                matr.array[i][j] = this.array[i][j] - x;\n" +
            "        return matr;\n" +
            "    }" +
            "    public Matrix mult(Matrix matr2)\n" +
            "    {\n" +
            "\n" +
            "        if (this.columns != matr2.rows)\n" +
            "            throw new RuntimeException(\"Check matrix size.\");\n" +
            "        Matrix matr = new Matrix(this.rows,matr2.columns);\n" +
            "        for (int i = 0; i < matr.rows; i++)\n" +
            "            for (int j = 0; j < matr.columns; j++)\n" +
            "                for (int k = 0; k < this.columns; k++)\n" +
            "                    matr.array[i][j] += this.array[i][k] * matr2.array[k][j];\n" +
            "        return matr;\n" +
            "    }\n" +
            "\n" +
            "    public Matrix mult(int numb)\n" +
            "    {\n" +
            "        Matrix matr = new Matrix(this.rows,this.columns);\n" +
            "        for (int i = 0; i < matr.rows; i++)\n" +
            "            for (int j = 0; j < matr.columns; j++)\n" +
            "                matr.array[i][j] = this.array[i][j] * numb;\n" +
            "        return matr;\n" +
            "    }\n" +
            "\n" +
            "    public Matrix(Matrix m) { this(m.array.clone()); }\n" +
            "}\n";

    String vectorClass = "public class Vector {\n" +
            "\n" +
            "    public List<Integer> array;\n" +
            "\n" +
            "    public Vector()\n" +
            "    {\n" +
            "        array = new ArrayList();\n" +
            "    }\n" +
            "\n" +
            "    public Vector(int n)\n" +
            "    {\n" +
            "        array = new ArrayList(n);\n" +
            "    }\n" +
            "\n" +
            "    public Vector(List<Integer> arr)\n" +
            "    {\n" +
            "        array = arr;\n" +
            "    }\n" +
            "\n" +
            "    public void print()\n" +
            "    {\n" +
            "        for (int i = 0; i < array.size(); i++)\n" +
            "            System.out.print(array.get(i) + \" \");\n" +
            "        System.out.println();\n" +
            "    }\n" +
            "\n" +
            "    public int get(int index)\n" +
            "    {\n" +
            "        return array.get(index);\n" +
            "    }\n" +
            "\n" +
            "    public int length()\n" +
            "    {\n" +
            "        return array.size();\n" +
            "    }\n" +
            "\n" +
            "    public void add(int elem)\n" +
            "    {\n" +
            "        array.add(elem);\n" +
            "    }\n" +
            "\n" +
            "    public void remove(int index)\n" +
            "    {\n" +
            "        array.remove(index);\n" +
            "    }\n" +
            "\n" +
            "    public Vector plus(Vector vect2)\n" +
            "    {\n" +
            "        if (this.array.size() != vect2.array.size())\n" +
            "            throw new RuntimeException(\"Check vector size.\");\n" +
            "        Vector vect = new Vector(array.size());\n" +
            "        for (int i = 0; i < vect.length(); i++)\n" +
            "            vect.array.set(i, array.get(i) + vect2.array.get(i));\n" +
            "        return vect;\n" +
            "    }\n" +
            "\n" +
            "public Vector plus(int x)\n" +
            "    {\n" +
            "        Vector vect = new Vector(array.size());\n" +
            "        for (int i = 0; i < vect.length(); i++)\n" +
            "            vect.array.set(i, array.get(i) + x);\n" +
            "        return vect;\n" +
            "    }" +
            "\n" +
            "    public Vector minus(Vector vect2)\n" +
            "    {\n" +
            "        if (this.array.size() != vect2.array.size())\n" +
            "            throw new RuntimeException(\"Check vector size.\");\n" +
            "        Vector vect = new Vector(array.size());\n" +
            "        for (int i = 0; i < vect.length(); i++)\n" +
            "            vect.array.set(i, array.get(i) - vect2.array.get(i));\n" +
            "        return vect;\n" +
            "    }\n" +
            "\n" +
            "public Vector minus(int x)\n" +
            "    {\n" +
            "        Vector vect = new Vector(array.size());\n" +
            "        for (int i = 0; i < vect.length(); i++)\n" +
            "            vect.array.set(i, array.get(i) - x);\n" +
            "        return vect;\n" +
            "    }" +
            "\n" +
            "    public int mult(Vector vect2)\n" +
            "    {\n" +
            "        if (this.array.size() != vect2.array.size())\n" +
            "            throw new RuntimeException(\"Check vector size.\");\n" +
            "        int numb = 0;\n" +
            "        for (int i = 0; i < array.size(); i++)\n" +
            "            numb += array.get(i) * vect2.array.get(i);\n" +
            "        return numb;\n" +
            "    }\n" +
            "\n" +
            "    public Vector mult(int numb)\n" +
            "    {\n" +
            "        Vector vect = new Vector(array.size());\n" +
            "        for (int i = 0; i < vect.length(); i++)\n" +
            "            vect.array.set(i, array.get(i) * numb);\n" +
            "        return vect;\n" +
            "    }\n" +
            "}\n";
}
