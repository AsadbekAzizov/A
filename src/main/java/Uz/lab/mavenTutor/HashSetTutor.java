package Uz.lab.mavenTutor;

import java.util.HashSet;

public class HashSetTutor {
    public static void main(String[] args) {
        HashSet<String> findConsonants = new HashSet<>();
        findConsonants.add("G");
        findConsonants.add("G1");
        findConsonants.add("G2");
        findConsonants.add("G3");
        findConsonants.add("G4");
        RemovingFirstGroup(findConsonants);
        FindGroups(findConsonants);
        CheckExist(findConsonants);
    }
    public static void RemovingFirstGroup(HashSet <String> groups) {
        groups.remove("G");
        groups.remove("G3");
        System.out.println(groups);
    }
    public static void FindGroups(HashSet <String> groups) {
        for (String group : groups) {
            if (group.equals("G1") || group.equals("G4")) {
                System.out.println(group);
            }
        }
    }
    public static void CheckExist(HashSet <String> groups) {
        System.out.println(groups.contains("G2"));
        System.out.println(groups.contains("G3"));
    }
}
