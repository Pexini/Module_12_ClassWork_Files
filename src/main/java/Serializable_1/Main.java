package Serializable_1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Account account = new Account("Anna", 21, "Anna21@mail.com");

        FileOutputStream fileOutput = new FileOutputStream("resources/accountser.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(account);
        outputStream.close();
        fileOutput.close();

    }
}
