package Uz.lab.mavenTutor.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DianaClass {
    public static void main(String[] args) {
        HashMap <String, Integer> bob = new HashMap<>();
        bob.put("Diana", 1);
        bob.remove("Diana");
        bob.put("Diana", 2);
        bob.put("Bob", 2);
        bob.remove("Bob");
        bob.put("Bob", 3);
        bob.put("Billy", 4);
        bob.remove("Billy");
        bob.put("Billy", 5);
        bob.put("Tom", 2);
        bob.remove("BTom");
        bob.put("Tom", 3);
        bob.put("Jerry", 1);
        bob.remove("Jerry");
        bob.put("Jerry", 5);
        System.out.println(bob.get("Diana"));
        System.out.println(bob);
        ArrayList <String> age = new ArrayList<>();
        age.add("Diana");
        age.remove("Diana");
        age.add("Satan");
        age.add("Tom");
        age.remove("Tom");
        age.add("God");
        age.add("Jerry");
        age.remove("Jerry");
        age.add("Supper Man");
        age.add("Billy");
        age.remove("Billy");
        age.add("Garry");
        age.add("Bob");
        age.remove("Bob");
        age.add("Amon-g-us");
        HashSet <String> classGroup = new HashSet<>();
        classGroup.add("G1");
        classGroup.remove("G1");
        classGroup.add("Group For Idiots");
        classGroup.add("G4");
        classGroup.remove("G4");
        classGroup.add("Hungry Group");
    }
}
