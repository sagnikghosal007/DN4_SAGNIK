package Week1DesignPatternsAndPrinciples.AdapterPatternExample;

public class StripeGateway {
    public void doTransaction(double amountInDollars) {
        System.out.println("Processed transaction of $" + amountInDollars + " using Stripe.");
    }
}
