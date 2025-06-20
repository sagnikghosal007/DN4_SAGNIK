package Week1DesignPatternsAndPrinciples.DecoratorPatternExample;

public class Test {
    public static void main(String args[]){
        Notifier email=new EmailNotifier();


        Notifier smsSlackNotifier=new SlackNotifierDecorator(new SMSNotifierDecorator(email));

        smsSlackNotifier.send("You have received your notification from our Notification Management System ");
    }
}
