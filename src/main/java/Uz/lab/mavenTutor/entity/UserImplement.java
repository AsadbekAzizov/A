package Uz.lab.mavenTutor.entity;

public class UserImplement extends User{
    private Boolean active;

    public UserImplement(String phoneNumber, String firstName, String chatId, Boolean active) {
        super(phoneNumber, firstName, chatId);
        this.active = active;
    }

    public UserImplement(Boolean active) {
        this.active = active;
    }

    public UserImplement() {
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UserImplement{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", chatId='" + chatId + '\'' +
                ", active=" + active +
                '}';
    }
}
