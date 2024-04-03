public class MobileDisplay implements Display, Observer{
  private WeatherData weatherData;
  private WeatherStation weatherStation;

  public MobileDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
    this.weatherData = weatherStation.getLatestData();
  }

  @Override public void display() {
    System.out.println("Displaying on mobile screen");
    System.out.println(weatherData);
  }

  @Override public void update() {
    this.weatherData = weatherStation.getLatestData();
  }
}
