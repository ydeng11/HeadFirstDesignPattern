package FacadePattern;

/*
  This is the impl of FacadePlayGame which simplifies the API.
 */
public class FacadePlayGameImpl implements FacadePlayGame {
  PlayGame playGame;

  public FacadePlayGameImpl(PlayGame playGame) {
    this.playGame = playGame;
  }

  @Override public void getDrinkAndSnack() {
    this.playGame.getDrink();
    this.playGame.getSnack();
  }

  @Override public void turnOnTv() {
    this.playGame.turnOnTv();
  }

  @Override public void playGame() {
    this.playGame.pluginConsole();
    this.playGame.turnOnConsole();
    this.playGame.selectGame();
    this.playGame.insertGameCd();
    this.playGame.startGame();
  }
}
