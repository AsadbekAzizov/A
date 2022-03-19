package Uz.lab.mavenTutor;

import java.util.HashMap;
import java.util.Set;

public class HashMapTutor {
    public static void main(String[] args) {
        HashMap<String, String> carsWithOwner = new HashMap<>();
        carsWithOwner.put("10A333BA", "Asadbek");
        carsWithOwner.put("01A222BA", "Shirina");
        carsWithOwner.put("01A333BA", "Asadbek");
        carsWithOwner.put("10A222BA", "Shirina");
        System.out.println(sellAsadbeksCar(carsWithOwner));
        showAllCars(carsWithOwner);
        System.out.println(carsWithOwner.values());
        //n%2==0
//create your day time hashMap
        //  coding->19.30,Azizbek
        //  French->19.30
        //  Breakfast->19.30

    }

    public static HashMap<String, String> sellAsadbeksCar(HashMap<String, String> carsWithOwner) {
        carsWithOwner.remove("01A333BA");
        return carsWithOwner;
    }

    private static void showAllCars(HashMap<String, String> carsWithOwner) {
        //1 example
        System.out.println("----------------------------------------1 example-------------------------------------");
        carsWithOwner.forEach((key, value) -> System.out.println("Key:  " + key + " value:" + value));
        //2
        System.out.println("----------------------------------------2 example-------------------------------------");
        Set<String> keySet = carsWithOwner.keySet();
        keySet.forEach(key -> {
            System.out.println("Key:  " + key + " value:" + carsWithOwner.get(key));
        });
        //3
        System.out.println("----------------------------------------3 example-------------------------------------");
        for (String key : keySet) {
            System.out.println("Key:  " + key + " value:" + carsWithOwner.get(key));
        }
    }
}
