package pages;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ReadingText
{
    public static List<String> readText(){
        File doc = new File("C:\\Users\\josez\\IdeaProjects\\patterns\\POM\\src\\Resources\\type.txt");
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(doc))) {
            list = br.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String typeCodificar(){
        List<String> list = readText();
        return list.get(0);
    }


    public static String textCodificar(){
        List<String> list = readText();
        return list.get(1);
    }


}


