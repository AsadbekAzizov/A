package Uz.lab.mavenTutor.entity;

import java.util.List;

public class AdminImplement extends User{
    private List <String> permisions;

    public AdminImplement(String phoneNumber, String firstName, String chatId, List<String> permisions) {
        super(phoneNumber, firstName, chatId);
        this.permisions = permisions;
    }

    public AdminImplement(List<String> permisions) {
        this.permisions = permisions;
    }

    public AdminImplement() {
    }

    public List<String> getPermisions() {
        return permisions;
    }

    public void setPermisions(List<String> permisions) {
        this.permisions = permisions;
    }

    @Override
    public String toString() {
        return "AdminImplement{" +
                "permisions=" + permisions +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", chatId='" + chatId + '\'' +
                '}';
    }
}
