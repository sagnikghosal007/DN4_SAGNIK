package Week1DesignPatternsAndPrinciples.StrategyPatternExample;

public class GPayPayment implements PaymentStrategy{
    private String email;
    public GPayPayment(String email){
        this.email=email;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid Rs: "+amt+"  with Gpay having mail id:  "+email);
    }
}
