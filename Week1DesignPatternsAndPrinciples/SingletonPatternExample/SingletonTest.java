package Week1DesignPatternsAndPrinciples.SingletonPatternExample;

public class SingletonTest {
    public static void main(String args[]){
        Logger logA=Logger.getInstance();
        logA.logg("First log message");

        Logger logB=Logger.getInstance();
        logB.logg("Second log message");


        if(logA==logB){
            System.out.println("Same Logger Instances");
        }
        else{
            System.out.println("Different Logger Instances");
        }
    }
}
