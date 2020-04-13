package ru.geekbrains.java_2.lesson_3;

public class Person {
    public String surname;
    public String phone_number;
    public String email;

    Person(String surname, String phone_number, String email){
        this.surname=surname;
        this.phone_number=phone_number;
        this.email=email;
    }

    public String getSurname(){
        return surname;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public String getEmail() {
        return email;
    }
}
