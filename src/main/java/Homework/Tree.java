package Homework;

public abstract class Tree implements Nature {

    public Integer root=2;
    public String name;

    public abstract void produce(String where);

    public void drink(Integer distance){
        System.out.println(name+" Grown "+distance+"m");
    }

    public Tree(Integer root, String name) {
        this.root = root;
        this.name = name;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                ", name='" + name + '\'' +
                '}';
    }
}

