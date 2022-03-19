package Uz.lab.mavenTutor;

import java.time.DayOfWeek;
import java.util.HashMap;

public class Homawork {
    public static void main(String[] args) {
        HashMap<String, String> DatOfTime = new HashMap<>();
        DatOfTime.put("Coding 19:30", "Asadbek");
        DatOfTime.put("French 4:00", "Asadbek");
        DatOfTime.put("Breakfast 8:00", "Asadbek");
        DatOfTime.put("Math 11:00", "Asadbek");
        DatOfTime.put("Piano 2:00", "Asadbek");
        System.out.println(DayOfWeek(DatOfTime));
        showAllDays(DatOfTime);
    }
     public static HashMap<String, String> DayOfWeek(HashMap<String, String> DatOfTime) {
        DatOfTime.remove("Piano 2:00");
        return DatOfTime;
     }
     private static void showAllDays(HashMap<String, String> DatOfTime){
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         DatOfTime.forEach(((s, s2) -> System.out.println(s + s2)));
     }
}
