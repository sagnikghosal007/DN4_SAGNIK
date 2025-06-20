package Week1DesignPatternsAndPrinciples.CommandPatternExample;

public class Test {
    public static void main(String[] args){
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton(); // Light is ON

        remote.setCommand(lightOff);
        remote.pressButton(); // Light is OFF
    }
}
