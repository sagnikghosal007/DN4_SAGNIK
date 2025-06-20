package Week1DesignPatternsAndPrinciples.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    private String cNum;
    public CreditCardPayment(String cNum){
        this.cNum=cNum;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid Rs:  "+amt+" using credit card with card number:  "+cNum);
    }
}
