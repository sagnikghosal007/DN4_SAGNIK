package Week1DesignPatternsAndPrinciples.ProxyPatternExample;

public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature_photo.jpg");
        Image image2 = new ProxyImage("architecture_diagram.png");


        image1.display();
        image2.display();


        image1.display();
    }
}
