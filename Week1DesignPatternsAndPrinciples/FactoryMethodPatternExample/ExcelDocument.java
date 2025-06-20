package Week1DesignPatternsAndPrinciples.FactoryMethodPatternExample;
public class ExcelDocument implements Document{
    @Override
    public void function() {
        System.out.println("Opening Excel Document");
    }
}
