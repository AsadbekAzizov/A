package Uz.lab.mavenTutor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebhookControler {
    @PostMapping
    public void WaitTelegramBotRequest(@RequestBody Update update) {
        System.out.println(update);
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());
        System.out.println(update.getMessage().getChatId());

        
    }
}