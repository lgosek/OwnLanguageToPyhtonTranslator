package pl.edu.agh.compilers.translator;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import pl.edu.agh.compilers.gramatykaLexer;
import pl.edu.agh.compilers.gramatykaParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TranslatorMain {
    public static void main (String[] args) {
        String filename = null;
        String outFilename = null;
        try {
            filename = args[0];
        } catch (Exception e) {
            System.err.println("Nie podano pliku wejściowego");
            return;
        }
        try {
            outFilename = args[1];
        } catch (Exception e) {
            System.err.println("Nie podano nazwy pliku wyjściowego");
            return;
        }
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(filename);
        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println("Błąd odczytu pliku wejściowego");
            return;
        }

        gramatykaLexer gramatykaLexer = new gramatykaLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(gramatykaLexer);
        gramatykaParser markupParser = new gramatykaParser(commonTokenStream);

        gramatykaParser.ProgramContext programContext = markupParser.program();
        TranslatorGramatykaVisitor visitor = new TranslatorGramatykaVisitor();
        String result = visitor.visit(programContext);

//        System.out.println(result);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(outFilename));
            writer.write(result);

            writer.close();
        } catch (IOException e) {
            System.err.println("Błąd zapisu do pliku wyjściowego");
        }
    }
}
