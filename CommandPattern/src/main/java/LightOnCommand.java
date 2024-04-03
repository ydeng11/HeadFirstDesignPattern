public class LightOnCommand implements SimpleCommand {
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override public void execute() {
    light.on();
  }
}
