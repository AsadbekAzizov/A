package Uz.lab.mavenTutor.service;

import Uz.lab.mavenTutor.entity.User;
import Uz.lab.mavenTutor.entity.UserImplement;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.List;

public class ProgressServiceImpl implements ProgressService {
    UserService userService = new UserServiceImplement();
    @Override
    public List<SendMessage> getMessage(Update update) {
        String text = update.getMessage().getText();
        String chatId = String.valueOf(update.getMessage().getChat().getId());
        String firstName = update.getMessage().getFrom().getFirstName();
        SendMessage sendMessage = null;
        if (firstName.equals("Asadbek")) {
            userService.newAdmin(update);
            System.out.println(UserServiceImplement.admins);
            System.out.println(userService.getAdmin(chatId));
            userService.removeAdmin(chatId);
            System.out.println(UserServiceImplement.admins);
        }
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
        if (text.equals("poem")){
            ArrayList <SendMessage> arrayList = new ArrayList<>();
            arrayList.add(createTextMessage("once opn a time ther was a knigth named carlos",chatId));
            arrayList.add(createTextMessage("and a killer dragon so dangerous everyone that came out of his cave died",chatId));
            arrayList.add(createTextMessage("but carlos would take the risk no matter what to show his glory he wanted to be famous LOL",chatId));
            arrayList.add(createTextMessage("he jumped into the cave and killed the dragon the end",chatId));

            arrayList.add(createTextMessage("once opon a time there was an evil boy named joking boy hahahahahah",chatId));
            arrayList.add(createTextMessage("he always laugthed because he was dumb and stupid and annoying l0oololol",chatId));
            arrayList.add(createTextMessage("but one day that changed cause an enemy joined the battle field?",chatId));
            arrayList.add(createTextMessage("His name vas johny he simply touched joker man and he died the end O_O",chatId));
            return List.of(arrayList.get ((int)(Math.random() * 2)));
        }
        if (text.equals("Poppy lady")){
            ArrayList <SendMessage> arrayList = new ArrayList<>();
        }
        else
            sendMessage = createTextMessage("I cannot answer",chatId);
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
