package Serializable_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws  Exception{
        FileInputStream fileInput = new FileInputStream("resources/accountser.txt");
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);

        Account account = (Account) objectInput.readObject();
        objectInput.close();
        fileInput.close();

        System.out.println(account.getName());
        System.out.println(account.getAge());
        System.out.println(account.getMail());


    }
}
