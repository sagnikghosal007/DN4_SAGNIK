package Week1DesignPatternsAndPrinciples.ObserverPatternExample;

public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

