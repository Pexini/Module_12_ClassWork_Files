package Serializable_1;

import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Anna", 21, "Anna21@mail.com");

        FileOutputStream fileOutput = new FileOutputStream("resources/accountser.txt");


    }
}
