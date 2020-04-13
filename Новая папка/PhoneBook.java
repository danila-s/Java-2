package ru.geekbrains.java_2.lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    HashMap<String , List <Person>> map= new HashMap<String, List<Person>>();
    List<Person>people = new ArrayList<Person>();


    public void add(Person person){
        if(map.containsKey(person.getSurname())){
            people=map.get(person.getSurname());
        }
        else {
            people = new ArrayList<Person>();
        }
        people.add(person);
        map.put(person.getSurname(), people);


    }

    public ArrayList<String> email(String key) throws NullPointerException{
        ArrayList<String>mailList = new ArrayList<String>();
        List<Person> x  = map.get(key);
        for (int i = 0; i <x.size() ; i++) {
            mailList.add(x.get(i).getEmail());

        }
        return mailList;
    }

    public ArrayList<String> phone_number(String key)throws NullPointerException{
        ArrayList<String>phones = new ArrayList<String>();
        List<Person> x  = map.get(key);
        for (int i = 0; i <x.size() ; i++) {
            phones.add(x.get(i).getPhone_number());

        }
        return phones;
    }



    }

