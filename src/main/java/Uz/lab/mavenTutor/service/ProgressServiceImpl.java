package Uz.lab.mavenTutor.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.List;

public class ProgressServiceImpl implements ProgressService {
    @Override
    public List<SendMessage> getMessage(Update update) {
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
        if (text.equals("JobMan")) {
            sendMessage = createTextMessage("you horibble gluer",chatId);
        }
        if (text.equals("SnowWhite poem")){
            ArrayList <SendMessage> arrayList = new ArrayList<>();
            arrayList.add(createTextMessage("once upon a time a snowy white girll",chatId));
            arrayList.add(createTextMessage("named snowwhite and called the brave knight",chatId));
            arrayList.add(createTextMessage("she was so white like snow, and was so glowy ooh",chatId));
            arrayList.add(createTextMessage("she was in the forest, and a dwarf helped her out",chatId));
            arrayList.add(createTextMessage("the dwarf name was Proffeser Mel,brang her to his house",chatId));
            arrayList.add(createTextMessage("she was so gratefull and she was so in joy",chatId));
            arrayList.add(createTextMessage("there were 11 more dwarfs at the house they her Proffesers Pals",chatId));
            arrayList.add(createTextMessage("they were all so different,each day they went mining",chatId));
            arrayList.add(createTextMessage("for gold and more treasure everyday was working time",chatId));
            arrayList.add(createTextMessage("and they lived happily ever after,The END LOL",chatId));
            return arrayList;
        }
        if (text.equals("Poppy lady")){
            ArrayList <SendMessage> arrayList = new ArrayList<>();
            arrayList.add()
        }
        return List.of(sendMessage);
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
        name.add("Charly Puth");
        name.add("Magnus Calrson");
        name.add("Elon Musk");
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
