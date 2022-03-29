package Uz.lab.mavenTutor.service;

import Uz.lab.mavenTutor.entity.AdminImplement;
import Uz.lab.mavenTutor.entity.User;
import Uz.lab.mavenTutor.entity.UserImplement;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface UserService {
    public void addUser(Update update);
    public void newAdmin(Update update);
    public UserImplement getUser(String chatId);
    public AdminImplement getAdmin(String chatId);
    public void removeUser(String chatId);
    public void removeAdmin(String chatId);
}
