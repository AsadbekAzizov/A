package Uz.lab.mavenTutor.service;

import Uz.lab.mavenTutor.entity.AdminImplement;
import Uz.lab.mavenTutor.entity.UserImplement;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;

public class UserServiceImplement implements UserService{
    public static final ArrayList <UserImplement> users = new ArrayList<>();
    public static final ArrayList <AdminImplement> admins = new ArrayList<>();
    @Override
    public void addUser(Update update) {
        UserImplement user = new UserImplement();
        user.setFirstName(update.getMessage().getFrom().getFirstName());
        user.setChatId(update.getMessage().getChat().getId().toString());
        users.add(user);
        // 1'st bug i didn't set the active field of the user
        // 2 bug the user will add more time it is incorrect "There should only be 1 user not two or three of more"
        //3'rd is same as first
    }

    @Override
    public void newAdmin(Update update) {
        AdminImplement admin = new AdminImplement();
        admin.setFirstName(update.getMessage().getFrom().getFirstName());
        admin.setChatId(update.getMessage().getChat().getId().toString());
        admins.add(admin);
        // 2 bug the user will add more time it is incorrect "There should only be 1 user not two or three of more"
        // 3'rd bug is that you have add permision here you have to admin set permisions and admin set permisions
        //3'rd is same as first
        //add mod role
    }

    @Override
    public UserImplement getUser(String chatId) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getChatId().equals(chatId)) {
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public AdminImplement getAdmin(String chatId) {
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getChatId().equals(chatId)) {
                return admins.get(i);
            }
        }
        return null;
    }

    @Override
    public void removeUser(String chatId) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getChatId().equals(chatId)) {
                users.remove(i);
            }
        }
    }

    @Override
    public void removeAdmin(String chatId) {
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getChatId().equals(chatId)) {
                admins.remove(i);
            }
        }
    }
}
