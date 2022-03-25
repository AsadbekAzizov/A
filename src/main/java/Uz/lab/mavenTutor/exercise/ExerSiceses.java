package Uz.lab.mavenTutor.exercise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ExerSiceses {
    public static void main(String[] args) {
        HashMap <String , Integer> spooderman = new HashMap<>();
        spooderman.put("Diana", 1);
        spooderman.remove("Diana");
        spooderman.put("Diana",2);
        spooderman.put("Toilet Paper", 28);
        spooderman.put("Orange", 36);
        spooderman.put("Pineapple", 150);
        spooderman.put("Pepsi", 57);
        spooderman.put("Bread", -1);
        spooderman.remove("Bread");
        System.out.println(spooderman.get("Pineapple"));
        System.out.println(spooderman);
        ArrayList <String> classMates = new ArrayList<>();
classMates.add("Diana");
classMates.remove(0);
classMates.add("Sara");
        HashSet <String> weekdays = new HashSet<>();
        weekdays.add("G1");
        weekdays.remove("G1");
        weekdays.add("G1-new");

        weekdays.add("Thursday");
        weekdays.add("FRiday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        weekdays.remove("FRiday");
        System.out.println(weekdays.contains("G1"));
        weekdays.forEach(s -> System.out.println(s));

//        HashMap Homework
///Dianna 1class
///remove Diana
        //put diana 2class

        //






    }
}
