package Read_Numbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("Set_of_Numbers.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineOfNumbers = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(lineOfNumbers);
        int result = 1;
        while (stringTokenizer.hasMoreElements()){
            result = result + Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println("Result " + result);
        bufferedReader.close();
        fileReader.close();
    }
}