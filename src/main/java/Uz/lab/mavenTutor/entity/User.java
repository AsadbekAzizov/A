package Uz.lab.mavenTutor.entity;

public abstract class User {
    protected String phoneNumber;
    protected String firstName;
    protected String chatId;

    public User(String phoneNumber, String firstName, String chatId) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.chatId = chatId;
    }

    public User() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", chatId='" + chatId + '\'' +
                '}';
    }
}
