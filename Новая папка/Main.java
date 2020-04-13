package ru.geekbrains.java_2.lesson_3;

import java.util.*;

public class Main {


    public static void main(String [] args){
        String[] start= {"hello","world","java","Collection","String","Go","home","OMG","OMG","hello","hello","cat","hello","dog","hello","hello"};
        ArrayList<String>words=giveMeWords(start);
        HashMap map =new HashMap(howMuch(start));
        PhoneBook book = new PhoneBook();
        Person ivan = new Person("ivan", "9989877","rwa@d");
        Person ivan1 = new Person("ivan", "998943877","rwrwrwra@d");
        Person volodya = new Person("volodya", "1119989877","111rwa@d");
        Person lola = new Person("lola", "000","000");
        book.add(ivan);
        book.add(ivan1);
        book.add(volodya);
        book.add(lola);
        System.out.println(book.email("ivan"));
        System.out.println(book.phone_number("lola"));


    }
    // - Найти список слов, из которых состоит текст (дубликаты не считать);
    private static ArrayList<String> giveMeWords (String[] s) {
        HashSet<String> set = new HashSet<String>(Arrays.asList(s));
        ArrayList<String>result = new ArrayList<String>(set);
        return result;

    }
     //- Посчитать сколько раз встречается каждое слово (использовать HashMap);
    private static HashMap<String,Integer> howMuch(String[]s){
        HashMap<String ,Integer> map = new HashMap<>();
        for(String a : s){
            if(map.containsKey(a))map.put(a,map.get(a)+1);
            else map.put(a , 1);
        }
        return map;

        }

    }

