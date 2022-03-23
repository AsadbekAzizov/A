package Uz.lab.mavenTutor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exersicesroppomovienightbro {
    public static void main(String[] args) {
        // You have to create an array list after this you have to get all array list 1 by 1
        // After that you have to show the numbers which is bigger than zero
        ArrayList<Integer> billy = new ArrayList<>();
        billy.add(1);
        billy.add(2);
        billy.add(-3);
        billy.add(4);
        billy.add(56);
        billy.add(-173);
        billy.add(90);
        billy.add(87);
        billy.add(1231);
        billy.add(2);
        billy.add(-33);
        billy.add(546);
        for (int i = 0; i <billy.size(); i++) {
            if(billy.get(i) % 2 != 0){
                createFile("workingFile.txt", billy.get(i).toString()+"\n");
            }
        }
    }
    public static void createFile (String nameFile,String dataToFile){
        try {
            FileWriter fileWriter = new FileWriter(nameFile, true);
            fileWriter.write(dataToFile);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
