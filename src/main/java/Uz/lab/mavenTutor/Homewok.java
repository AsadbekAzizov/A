package Uz.lab.mavenTutor;

import java.util.ArrayList;
public class Homewok {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("d");
        letters.add("f");
        letters.add("o");
        letters.add("i");
        letters.add("r");
        letters.add("s");
        letters.add("y");
        System.out.println(namefindLetter(letters));
    }

    public static ArrayList <String> namefindLetter(ArrayList<String> letters) {
        for (int i = 0; i < letters.size(); i++) {
            if (" i, i, e, o, a, u, y".contains(letters.get(i)))
                letters.remove(i);
        }
        return letters;
    }
}