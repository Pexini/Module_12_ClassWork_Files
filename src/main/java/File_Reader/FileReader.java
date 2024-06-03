package File_Reader;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("Text.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
            StringBuilder stringBuilder = new StringBuilder();
            bufferedReader.lines().forEach(x -> stringBuilder.append(x + "\n"));
            System.out.print(stringBuilder.toString());

        } catch (FileNotFoundException e) {
            System.out.println(" ;( ");
        } catch (IOException e) {
            System.out.println(" :(");
        }
    }
}
