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
        if (text.equals("poem")){
            int random =(int )(Math.random()*3);
            if (random==0){
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
            if (random==1){
                ArrayList <SendMessage> arrayList = new ArrayList<>();
                arrayList.add(createTextMessage("There was a old lady called poppy but every body called her SweeatPopi",chatId));
                arrayList.add(createTextMessage("because she was a kind loving human being",chatId));
                arrayList.add(createTextMessage("one day she was rushing to her grandma who said it was a emergency",chatId));
                arrayList.add(createTextMessage("Poppy ran through the street in tears everybody was shocked",chatId));
                arrayList.add(createTextMessage("because poppy had only cried at her parents funiral and never after",chatId));
                arrayList.add(createTextMessage("There were all so curious so they all followed her",chatId));
                arrayList.add(createTextMessage("Poppy entered into a shaky old house the town followed",chatId));
                arrayList.add(createTextMessage("They all noked poppy opened the door...??She was shocked the whole town follow",chatId));
                arrayList.add(createTextMessage("than poppy said her grandma had fell ill and she was her only family left",chatId));
                arrayList.add(createTextMessage("the town said we will help you gather the money so they did then poppy had enough money to buy medicine she huged everywone who helped and they lived happily ever after.THE END",chatId));
                return arrayList;
            }
            if (random==2){
                ArrayList <SendMessage> arrayList = new ArrayList<>();
                arrayList.add(createTextMessage("there was a gamer called john he was a realy good gamer so they all called him great john",chatId));
                arrayList.add(createTextMessage("but he was not happy he wanted to actually travel in time to the 5050 year ",chatId));
                arrayList.add(createTextMessage("so he took up computer science, and chemistry to learn a lot of ussful stuf for engineering",chatId));
                arrayList.add(createTextMessage("but he struggled a lot he was not the best at both of them because he just gamed and made mincraft and fornite videos",chatId));
                arrayList.add(createTextMessage("but one day changed his life!!!!!",chatId));
                arrayList.add(createTextMessage("one day he saw a strange video but the channel has billions of views",chatId));
                arrayList.add(createTextMessage("the channel made engeeniring vids he was so happy",chatId));
                arrayList.add(createTextMessage("so every day he watched over 50vids and had classes",chatId));
                arrayList.add(createTextMessage("finally he build the time traveler it was supper hard but he did it know he is a very famous engineer",chatId));
                return arrayList;
            }

        }
        else {
            sendMessage=createTextMessage("i cannot answer",chatId);
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
    Short aShort = new Short(System.setIn("mod",char));
    ArrayList <Short> name= new ArrayList<>();

    public Short getaShort() {
        return aShort;
    }
    public static void mod(String) {
        mod("Changing thing is called a mod");
        mod("Changes like putting a mod to a game like mincraft");
        mod("its like adding something to a code");

    }
}
