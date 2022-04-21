
import java.io.IOException;

public class CodificarTextS {
    public static void main(String[] args) throws IOException {
        String text = ReadingTextS.textCodificar();
        System.out.println("Input  "+ text);
        String typeCod = ReadingTextS.typeCodificar();

        if (typeCod.equals("class")){
            String cifrado = CifradoCesar.cifradoCesar(text,5);
            Singleton.printLog("Output "+ cifrado);
            Singleton.printLog("Cifrado Cesar");
            String decifrar = CifradoCesar.descifradoCesar(cifrado,5);
            Singleton.printLog("Mensaje Original"+decifrar);

        }

        if (typeCod.equals("public")){
            String cifrado = CifradoUnicode.stringToUnicode(text);
            Singleton.printLog("Output "+ cifrado);
            Singleton.printLog("Cifrado Unicode");
        }


    }
}
