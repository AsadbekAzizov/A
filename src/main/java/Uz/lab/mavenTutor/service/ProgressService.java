package Uz.lab.mavenTutor.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;

public interface ProgressService {
    public SendMessage getMessage(Update update);
    public ArrayList<SendMessage> count();
    public SendMessage sayHello(Update update);
    public SendMessage createTextMessage(String text,String chatId);

}
