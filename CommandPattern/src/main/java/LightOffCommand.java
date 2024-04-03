public class LightOffCommand implements SimpleCommand {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override public void execute() {
    light.off();
  }
}
