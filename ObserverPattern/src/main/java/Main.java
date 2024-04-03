public class Main {
  public static void main(String[] args) {
    WeatherStation weatherStation = WeatherStation.getInstance();
    NotificationCenter notificationCenter = NotificationCenterImpl.getInstance();
    weatherStation.setNotificationCenter(notificationCenter);

    MobileDisplay mobileDisplay = new MobileDisplay(weatherStation);
    WebsiteDisplay websiteDisplay = new WebsiteDisplay(weatherStation);

    notificationCenter.addObserver(mobileDisplay);
    notificationCenter.addObserver(websiteDisplay);

    mobileDisplay.display();
    websiteDisplay.display();

    weatherStation.updateWeatherData(WeatherData.createWeatherData());

    mobileDisplay.display();
    websiteDisplay.display();
  }
}
