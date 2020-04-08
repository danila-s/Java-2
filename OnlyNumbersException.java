package ru.geekbrains.java_2.lesson2.homework;

public class OnlyNumbersException extends Exception {

    public OnlyNumbersException(Throwable e){
        initCause(e);
        System.out.println("ONLY NUMBERS!!!!");
    }
}
