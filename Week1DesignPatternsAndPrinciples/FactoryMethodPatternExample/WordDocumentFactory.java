package Week1DesignPatternsAndPrinciples.FactoryMethodPatternExample;
public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
