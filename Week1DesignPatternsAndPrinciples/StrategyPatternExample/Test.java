package Week1DesignPatternsAndPrinciples.StrategyPatternExample;

public class Test {
    public static void main(String args[]){
        PaymentContext context=new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1213"));
        context.payAmount(68320.56);

        context.setPaymentStrategy(new GPayPayment("sagnikghosal5@gmail.com"));
        context.payAmount(750.288);
    }
}
