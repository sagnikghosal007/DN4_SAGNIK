package Week1DesignPatternsAndPrinciples.FactoryMethodPatternExample;
public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
