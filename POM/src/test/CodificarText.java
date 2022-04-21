package test;

import pages.CifradoCesar;
import pages.CifradoUnicode;
import pages.ReadingText;

import java.io.IOException;

public class CodificarText {
    public static void main(String[] args) throws IOException {
        String text = ReadingText.textCodificar();
        System.out.println("Input  "+ text);
        String typeCod = ReadingText.typeCodificar();

        if (typeCod.equals("class")){
            String cifrado = CifradoCesar.cifradoCesar(text,5);
            System.out.println("Output "+ cifrado);
            System.out.println("Cifrado Cesar");
        }

        if (typeCod.equals("public")){
            String cifrado = CifradoUnicode.stringToUnicode(text);
            System.out.println("Output "+ cifrado);
            System.out.println("Cifrado Unicode");
        }


    }
}
