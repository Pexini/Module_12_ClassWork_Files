package File_Reader_Tokenazer;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        File in = new File("resources/In.txt");
        File out = new File("resources/out.txt");
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out)));) {

            // Деление по пробелам
            bufferedReader.lines().forEach(x -> {
                String [] arrayString = x.split(" ");
                for (String str : arrayString){
                    // вывод в консоль найденный текст по matches
                    if (str.matches("(H[a-zA-Z]*[0-5])")){ // вывод по правилу все что начинается с заглавной Н и заканчивается на цифру от 0 до 5 пример : Hello2 / H3
                        System.out.println(str);
                    }
                    printWriter.println(str);
                }




//                StringTokenizer stringTokenizer = new StringTokenizer(x, "Java", true);    (Деление по буквам)
//                while (stringTokenizer.hasMoreTokens()) {
//                    printWriter.println("Token: " + stringTokenizer.nextToken());
//                }


//            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            while (stringTokenizer.hasMoreTokens()){
//                System.out.println(stringTokenizer.nextToken());
            });
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } catch (IOException e) {
            System.out.print("Wrong File");
        }
    }

}

