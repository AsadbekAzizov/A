package Uz.lab.mavenTutor;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ExerSiceses {
    public static void main(String[] args) {
        HashMap <String , Integer> spooderman = new HashMap<>();
        spooderman.put("Banana", 15);
        spooderman.put("Toilet Paper", 28);
        spooderman.put("Orange", 36);
        spooderman.put("Pineapple", 150);
        spooderman.put("Pepsi", 57);
        spooderman.put("Bread", -1);
        spooderman.remove("Bread");
        System.out.println(spooderman.get("Pineapple"));
        System.out.println(spooderman);
        ArrayList <Integer> luckynumbers = new ArrayList<>();
        luckynumbers.add(1);
        luckynumbers.add(5);
        luckynumbers.add(33);
        luckynumbers.add(87);
        luckynumbers.add(7);
        luckynumbers.add(2);
        luckynumbers.add(9);
        luckynumbers.add(10);
        luckynumbers.remove(7);
        System.out.println(luckynumbers.get(0));
        HashSet <String> weekdays = new HashSet<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("FRiday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        weekdays.remove("FRiday");
        System.out.println(weekdays.contains("FRiday"));
        weekdays.forEach(s -> System.out.println(s));
    }
}
