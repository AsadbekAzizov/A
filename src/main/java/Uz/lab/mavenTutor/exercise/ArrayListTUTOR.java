package Uz.lab.mavenTutor.exercise;

import java.util.ArrayList;

public class ArrayListTUTOR {
    public static void main(String[] args) {
        addingellement();
    }
    public static void addingellement(){
        ArrayList <String>MambaAndBobaJuice=new ArrayList<>();
        MambaAndBobaJuice.add("do you like boba or mamba or cottoncandy");//0
        MambaAndBobaJuice.add("scrunchies are the best for my hair");//1
        MambaAndBobaJuice.add("i hate brushing my hair that is why it is a sponge");//2
        MambaAndBobaJuice.add("i love Clothes and makeup and you naime it");//3
        MambaAndBobaJuice.add("I love singing and moon so it =to talkingToTheMoon by bruno mars");//4
        MambaAndBobaJuice.add("I love sushi rolleton/noodles and raviolly");//5
        MambaAndBobaJuice.add("I love sofia");//6
        MambaAndBobaJuice.add("burger");//7
        System.out.println(MambaAndBobaJuice);
        getall(MambaAndBobaJuice);
        getilubable(MambaAndBobaJuice);
        deleteliumenet(MambaAndBobaJuice);

    }
    public static void deleteliumenet(ArrayList<String> REX){
        REX.remove(0);
        System.out.println(REX);
    }
    public static void getilubable(ArrayList<String> LUNA){
        System.out.println(LUNA.get(4));
    }


    public static void getall(ArrayList<String> SOFIA) {
        System.out.println(SOFIA.get(6));

    }
}