import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream("files/input.txt"));

            GrammarLexer lexer = new GrammarLexer(input);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            MatVecVisitor visitor = new MatVecVisitor();
            String output = visitor.visit(tree);

            File file= new File ( "java_out/Result.java");
            if (!file.exists())
                file.createNewFile();

            FileWriter writer = new FileWriter(file, false);
            writer.write(output);
            writer.close();

        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
