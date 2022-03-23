package Uz.lab.mavenTutor.OOP.Abstraction;

public abstract class  Bird implements Animal {
    public Integer wings=2;
    public String name;

    public abstract void fly(String where);

    public void walk(Integer distance){
        System.out.println(name+" walked "+distance+"m");
    }

    public Bird(Integer wings, String name) {
        this.wings = wings;
        this.name = name;
    }

    public Integer getWings() {
        return wings;
    }

    public void setWings(Integer wings) {
        this.wings = wings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                ", name='" + name + '\'' +
                '}';
    }
}
