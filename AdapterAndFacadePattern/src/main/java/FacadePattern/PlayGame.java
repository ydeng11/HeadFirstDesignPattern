package FacadePattern;

/*
  Suppose we have a PlayGame interface which has many steps
  and we could group them accordingly
 */
public interface PlayGame {
  void pluginConsole();
  void turnOnTv();
  void turnOnConsole();
  void selectGame();
  void insertGameCd();
  void getDrink();
  void getSnack();
  void startGame();
}
