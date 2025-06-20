package Week1DesignPatternsAndPrinciples.AdapterPatternExample;

public class PaymentSystemTest {
    public static void main(String[] args){
        PaymentProcessor paypal=new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(150.0);

        PaymentProcessor stripe=new StripeAdapter(new StripeGateway());
        stripe.processPayment(250.0);
    }
}
