import org.telegram.telegrambots.*;
import org.telegram.telegrambots.api.objects.CallbackQuery;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.TelegramBotsApi;

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

    }
}