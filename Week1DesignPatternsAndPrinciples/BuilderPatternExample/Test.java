package Week1DesignPatternsAndPrinciples.BuilderPatternExample;

public class Test {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder("Intel i5", "8GB")
                .build();

        Computer game = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .build();

        Computer dev = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println("Basic Computer:");
        System.out.println(comp);

        System.out.println("\nGaming Computer:");
        System.out.println(game);

        System.out.println("\nDeveloper Machine:");
        System.out.println(dev);
    }
}
