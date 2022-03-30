package Uz.lab.mavenTutor.exercise;

public class Exeption {
    public static void main(String[] args) {
        String name = getName(true);
        System.out.println(name);
        try {
            getName(false);
        } catch (Booba e) {
            e.printStackTrace();
        }finally {
            System.out.println("boobas");
        }
        System.out.println("booba");
    }

    public static String getName(Boolean admin) throws Booba {
        if (admin) {
            return "Booba";
        } else {
            throw new Booba("Delete Booba");
        }

    }
}
