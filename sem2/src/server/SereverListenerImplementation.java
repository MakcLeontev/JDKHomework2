package server;

public class SereverListenerImplementation implements ServerListener{
    @Override
    public void onMessageRecived(String str) {
        System.out.println("Message:"+ str);
    }
}
