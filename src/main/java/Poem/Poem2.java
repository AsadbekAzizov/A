package Poem;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;

public class Poem2 {
    @Override
    public SendMessage getMessage(Update update) {
        String text = update.getMessage().getText();
        String chatId = String.valueOf(update.getMessage().getChat().getId());
        SendMessage sendMessage = null;

        if (text.equals("/start")) {
            sendMessage = sayHello(update);
        }
        if (text.equals("CountToTen")) {
            sendMessage = countToTen(chatId);
        }
        if (text.equals(("Random"))) {
            sendMessage = Random(chatId);
        }
        if (text.equals(("RandomName"))) {
            sendMessage = RandomName(chatId);
        }
        return sendMessage;
    }

    @Override
    public SendMessage sayHello(Update update) {
        String firstName = update.getMessage().getChat().getFirstName();
        String chatId = String.valueOf(update.getMessage().getChat().getId());
        return createTextMessage("Hello" + firstName,chatId);
    }

    @Override
    public ArrayList<SendMessage> count() {
        return null;
    }
    @Override
    public SendMessage countToTen(String chatId) {
        return createTextMessage("1,2,3,4,5,6,7,8,9,10",chatId);
    }
    @Override
    public SendMessage Random(String chatId) {
        return createTextMessage(""+(int)(Math.random() * 10),chatId);
    }
    @Override
    public SendMessage RandomName(String chatId) {
        ArrayList <String> name= new ArrayList<>();
        name.add("Garry");
        name.add("SpogeBob");
        name.add("Martin");
        name.add("Carlos");
        name.add("Karl");
        name.add("Albert Instoin");
        return createTextMessage(name.get((int)(Math.random() * 6)),chatId);

    }
    @Override
    public SendMessage createTextMessage(String text,String chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId);
        return sendMessage;
    }
}
