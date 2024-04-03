public class WebsiteDisplay implements Display, Observer {
  private WeatherStation weatherStation;
  private WeatherData weatherData;

  public WebsiteDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
    this.weatherData = weatherStation.getLatestData();
  }

  @Override public void display() {
    System.out.println("Displaying on website screen");
    System.out.println(weatherData);
  }

  @Override public void update() {
    this.weatherData = weatherStation.getLatestData();
  }
}
