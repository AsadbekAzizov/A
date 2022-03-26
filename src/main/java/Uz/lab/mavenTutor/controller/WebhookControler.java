package Uz.lab.mavenTutor.controller;

import Uz.lab.mavenTutor.service.ProgressService;
import Uz.lab.mavenTutor.service.ProgressServiceImpl;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;


@RestController
public class WebhookControler {
    ProgressService progressService = new ProgressServiceImpl();
    String token = "5291972137:AAF7JLY3eqwci8r8aVmzGoGE2TiRQ8AK-Gw";

    @PostMapping
    public void WaitTelegramBotRequest(@RequestBody Update update) {
        SendMessage message = progressService.getMessage(update);
        System.out.println(execute(message));
    }

    public String execute(BotApiMethod<?> message) {
        HttpEntity<BotApiMethod<?>> request = new HttpEntity<>(message);
        try {
            RestTemplate restTemplate = new RestTemplate();
            String telegramResultDTO = restTemplate.postForObject("https://api.telegram.org/bot" + token + "/sendMessage", request, String.class);
            return telegramResultDTO;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}