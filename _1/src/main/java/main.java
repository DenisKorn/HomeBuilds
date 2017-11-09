import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.CallbackQuery;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.BotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.TelegramBotsApi;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class main extends TelegramLongPollingBot {

    public static void main(String[] args) {
        // TelegramBot bot = new TelegramBot("369166204:AAFfXhL-blM-T4bJL_nC0h7v0a2yXs9kfeA");

        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        try {
            telegramBotsApi.registerBot(new main());
        } catch (TelegramApiException e){e.printStackTrace();
        }
    }

    public String getBotUsername(){
        return "DenisKorn";
    }

    @Override
    public String getBotToken(){
        return "369166204:AAFfXhL-blM-T4bJL_nC0h7v0a2yXs9kfeA";
    }

    public void onUpdateReceived(Update update){
        Message message;

        message = update.getMessage();

        String userText = message.getText();

        System.out.println(userText);
        sendMes(message);

    }

    private Message sendMes(Message message) {
        Message messageID = message;
        //  boolean result;
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(false);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(message.getText().toString());

        try {
            messageID = sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();

        }
        return messageID;
    }
}