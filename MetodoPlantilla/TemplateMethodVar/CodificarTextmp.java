import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodificarTextmp {

    public static void main(String[] args) throws IOException {
        File doc = new File("C:\\Users\\josez\\IdeaProjects\\patterns\\MetodoPlantilla\\TemplateMethodVar\\type.txt");
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(doc))) {
            list = br.lines().collect(Collectors.toList());
        }
        String text = list.get(0);
        System.out.println("Input  "+ text);
        String typeCod = list.get(1);

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
