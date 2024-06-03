package org.example;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("Text.txt");
        while (fileReader.ready()){
            char currentSumbol = (char) fileReader.read();
            System.out.print(currentSumbol);
        }

        fileReader.close();
    }
}