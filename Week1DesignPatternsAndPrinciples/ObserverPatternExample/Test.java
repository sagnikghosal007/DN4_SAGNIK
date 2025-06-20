package Week1DesignPatternsAndPrinciples.ObserverPatternExample;

public class Test {
    public  static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStock("NIFTY50", 5908.4575);
        stockMarket.setStock("HDFC", 1450.20);
    }
}
