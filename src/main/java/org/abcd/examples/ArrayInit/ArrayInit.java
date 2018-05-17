package main.java.org.abcd.examples.ArrayInit;

import org.abcd.examples.ArrayInit.gen.ArrayInitLexer;
import org.abcd.examples.ArrayInit.gen.ArrayInitParser;
import org.abcd.examples.ArrayInit.gen.ArrayInitVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class ArrayInit {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(
                new FileInputStream("txt_files/input.txt"));

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); // begin parsing at init rule
        FileWriter writer = new FileWriter("txt_files/output.txt", false);
        writer.write(tree.toStringTree(parser));
        writer.close();
//        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
