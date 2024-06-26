package Serializable_1;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;
    private int age;
    private transient String mail; //Если хотим скрыть поле от Сериализации

    public Account(String name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
