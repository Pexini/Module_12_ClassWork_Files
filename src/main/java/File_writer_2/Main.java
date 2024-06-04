package File_writer_2;

import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        File in = new File("resources/file_in_for_textWriter2");
        File out = new File("resources/file_out_for_textWriter2");

        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
                PrintWriter printWriter =new PrintWriter(new OutputStreamWriter(new FileOutputStream(out)));
        ) {

            bufferedReader.lines().forEach(string -> printWriter.println(string.toUpperCase(Locale.ROOT)));  // перевод всего текста в верхний регистр

//         printWriter.println(bufferedReader.readLine().toUpperCase(Locale.ROOT)); - перевод в веръний регистр одной строки.


        } catch (FileNotFoundException e) {
            System.out.println("Not file");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
