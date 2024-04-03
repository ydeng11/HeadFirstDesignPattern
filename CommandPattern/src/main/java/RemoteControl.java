public class RemoteControl {
  SimpleCommand command;

  void setCommand(SimpleCommand command) {
    this.command = command;
  }

  void pushButton() {
    command.execute();
  }
}
