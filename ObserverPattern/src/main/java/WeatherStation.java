public class WeatherStation {
  private static WeatherStation instance;
  private WeatherData weatherData;
  private NotificationCenter notificationCenter;
  private WeatherStation() {
    this.weatherData = WeatherData.createWeatherData();
  };
  public static WeatherStation getInstance() {
    if (instance == null) {
      instance = new WeatherStation();
    }
    return instance;
  }

  public void setNotificationCenter(NotificationCenter notificationCenter) {
    this.notificationCenter = notificationCenter;
  }

  public void updateWeatherData(WeatherData weatherData) {
    System.out.println("Update Weather and Notify Observers");
    this.weatherData = weatherData;
    this.notificationCenter.notifyObservers();
  }

  public WeatherData getLatestData() {
    return weatherData;
  }
}
