public class CifradoUnicode {
    public static String stringToUnicode(String string) {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt (i); // Saca cada carácter
            unicode.append ("\\ u" + Integer.toHexString (c)); // Convertir a Unicode
        }
        return unicode.toString();
    }
}
