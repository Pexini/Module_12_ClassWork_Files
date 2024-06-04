package FileWriter_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("resources/Set_of_Numbers.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineOfNumbers = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(lineOfNumbers);
        int result = 1;
        while (stringTokenizer.hasMoreElements()) {
            result = result + Integer.parseInt(stringTokenizer.nextToken());

        }
        PrintWriter printWriter = new PrintWriter("resources/result.txt");
        printWriter.println(result);
        printWriter.close();
        bufferedReader.close();
        fileReader.close();
    }

}
