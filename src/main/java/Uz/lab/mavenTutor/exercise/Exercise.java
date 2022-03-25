package Uz.lab.mavenTutor.exercise;

import java.util.HashSet;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        Integer []numbers= {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 6, 6, 6, 6, 11, -5, 0};
        HashSet<Integer> findNumbersWith1 = new HashSet<>();
        // add all = only shows non-duplicated numbers
        findNumbersWith1.addAll(List.of(numbers));
        System.out.println(findNumbersWith1);
    }
}
