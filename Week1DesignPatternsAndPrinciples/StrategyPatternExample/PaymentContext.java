package Week1DesignPatternsAndPrinciples.StrategyPatternExample;


public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    //setter method to set the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //payment excution
    public void payAmount(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}

