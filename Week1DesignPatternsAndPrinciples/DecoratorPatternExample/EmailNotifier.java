package Week1DesignPatternsAndPrinciples.DecoratorPatternExample;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Email Notification is here ."+message);
    }
}
