package org.krypto;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("wiersz.txt");
        TextAnalyzer tak = new TextAnalyzer(path);

        System.out.println(tak.statistics());

        try(PrintWriter writer = new PrintWriter("statystyki.txt")) {
            writer.println(tak.statistics());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}