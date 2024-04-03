public class Main {
  public static void main(String[] args) {
    RemoteControl control = new RemoteControl();
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    control.setCommand(lightOnCommand);
    control.pushButton();

    control.setCommand(lightOffCommand);
    control.pushButton();
  }
}
