abstract class Game {
  // Template method, marked as final to prevent overriding
  final void playGame() {
    initialize();
    startGame();
    play();
    endGame();
  }

  // Default implementations of the steps
  void initialize() {
    System.out.println("Game initialized.");
    if (hook()) {
      System.out.println("Hook applied!");
    }
  }

  void startGame() {
    System.out.println("Game started.");
  }

  abstract void play();

  void endGame() {
    System.out.println("Game ended.");
  }

  boolean hook() {
    return false;
  }
}

class Chess extends Game {
  @Override
  void play() {
    System.out.println("Playing chess game.");
  }
}

class Soccer extends Game {
  @Override
  void play() {
    System.out.println("Playing soccer game.");
  }

  // Overriding optional methods for specific needs
  @Override
  void initialize() {
    super.initialize();  // Optional call to super method
    System.out.println("Soccer game setup with 11 players on each team.");
  }

  @Override
  boolean hook() {
    return true;
  }
}

public class Main {
  public static void main(String[] args) {
    Game chess = new Chess();
    chess.playGame();

    System.out.println("-----");

    Game soccer = new Soccer();
    soccer.playGame();
  }
}
