package Uz.lab.mavenTutor.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.List;

public interface ProgressService {
    public List<SendMessage> getMessage(Update update);
    public ArrayList<SendMessage> count();
    public SendMessage sayHello(Update update);

    SendMessage RandomName(String chatId);
    public SendMessage createTextMessage(String text, String chatId);
    public SendMessage countToTen(String chatId);
    public SendMessage Random(String chatId);
}
