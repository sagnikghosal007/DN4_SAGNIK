package Week1DesignPatternsAndPrinciples.FactoryMethodPatternExample;
public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
