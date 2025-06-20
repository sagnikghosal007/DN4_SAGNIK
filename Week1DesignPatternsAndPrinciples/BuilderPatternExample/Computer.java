package Week1DesignPatternsAndPrinciples.BuilderPatternExample;

public class Computer{
    private String Cpu;
    private String Ram;
    private String Storage;

    private Computer(Builder builder) {
        this.Cpu = builder.Cpu;
        this.Ram = builder.Ram;
        this.Storage = builder.Storage;
    }
    public static class Builder{
        private String Cpu;
        private String Ram;
        private String Storage;


        // Constructor for required attributes
        public Builder(String Cpu, String Ram) {
            this.Cpu = Cpu;
            this.Ram = Ram;
        }

        // Chained methods for optional attributes
        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + Cpu + ", RAM=" + Ram + ", Storage=" + Storage + "]";
    }
}
