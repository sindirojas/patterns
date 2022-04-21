import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class CifradoDes {
    /* Modo de cifrado EDS Relleno ECB PKCS5Padding clave de cifrado seeyonsso salida juego de caracteres base64 utf-8
            */
    public static String EncryptString(String strText, String sKey) {
        // Cifrado MD5
        //   String md5s = EncryptMD5.getMD5(strText);
        try {
            SecureRandom random = new SecureRandom();
            byte[] bkey  =(sKey.substring(0,8)).getBytes();
            DESKeySpec deskey = new DESKeySpec(bkey);
            // Cree una fábrica de claves y úsela para convertir DESKeyspec en
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(deskey);
            // El objeto de cifrado realmente completa la operación de cifrado
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

            // cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // Inicializa el objeto Cipher con la clave
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            // Ahora, obtenga los datos y cifrelos
            // // Ejecuta formalmente la operación de cifrado
            // String str = md5s + strText;
            byte[] t = strText.getBytes("UTF-8");
            byte[] bResult = cipher.doFinal(t);
            // 1. Después de cifrar el byte [], debe convertir el byte cifrado [] a base64 para guardar, como por ejemplo:
            //BASE64Encoder base64encoder = new BASE64Encoder();
            //String encode=base64encoder.encode(bResult);
            //return encode;

        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }
}
