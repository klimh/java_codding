package org.krypto;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TranslatorApp {
    public static void main(String[] args) throws IOException {
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter text to be translated: ");
        String text = br.readLine();

        Translation translation = translate.translate(text, Translate.TranslateOption.sourceLanguage("pl"),
                Translate.TranslateOption.targetLanguage("en"));

        System.out.println("Tłumaczenie: " + translation.getTranslatedText());

    }
}