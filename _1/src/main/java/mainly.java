import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.TelegramBotsApi;

/*public class main extends TelegramLongPollingBot {

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

    public String getBotToken(){
        return "369166204:AAFfXhL-blM-T4bJL_nC0h7v0a2yXs9kfeA";
    }

    public void onUpdateReceived(Update update){
        Message message;
        String testRes;

        message = update.getMessage();

        String userText = message.getText();

        TestClass test = new TestClass();

        test.setUp();
       testRes = test.start();
        test.close();




        System.out.println(testRes);
        sendMes(message, testRes);



    }

    private Message sendMes(Message message, String testRes) {
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
}*/
class FinDemo{
    int x;
    FinDemo(int i){
        x=i;
    }

    protected void finalize(){
        System.out.println("Finalization" + x);
    }
    void generator(int i){
        FinDemo o = new FinDemo(i);
    }
}
class mainly{
    public static void main (String args[]){
        int count;

        FinDemo ob = new FinDemo(0);
        for(count = 1; count < 10000000; count++)
            ob.generator(count);
    }
}