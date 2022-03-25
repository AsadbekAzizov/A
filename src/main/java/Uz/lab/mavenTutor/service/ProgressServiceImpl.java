package Uz.lab.mavenTutor.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;

public class ProgressServiceImpl implements ProgressService {
    @Override
    public SendMessage getMessage(Update update) {
        String text = update.getMessage().getText();

        SendMessage sendMessage = null;

        if (text.equals("/start")) {
            sendMessage = sayHello(update);
        }

        return sendMessage;
    }

    @Override
    public SendMessage sayHello(Update update) {
        String firstName = update.getMessage().getChat().getFirstName();
        String chatId = String.valueOf(update.getMessage().getChat().getId());
        return createTextMessage("Hello " + firstName,chatId);
    }

    @Override
    public ArrayList<SendMessage> count() {
        return null;
    }

    @Override
    public SendMessage createTextMessage(String text,String chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId);
        return sendMessage;
    }
}
