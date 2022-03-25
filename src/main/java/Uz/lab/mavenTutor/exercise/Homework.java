package Uz.lab.mavenTutor.exercise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        // make it remove ---> EVERY <--- 2 in he arraylist
        Integer[] numbers = {2, 3, 2, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 2, 3, 1, 4, 5};
        HashSet<Integer> findNumbersWith2 = new HashSet<>();
        findNumbersWith2.addAll(List.of(numbers));
        System.out.println(findNumbersWith2);
    }
}
