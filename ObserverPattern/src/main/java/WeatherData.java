import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class WeatherData {
  public int temperature;
  public int humidity;
  public String date;
  private static ThreadLocalRandom random = ThreadLocalRandom.current();

  public WeatherData(int temperature, int humidity, String date) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.date = date;
  }

  public static WeatherData createWeatherData() {
    return new WeatherData(random.nextInt(40), random.nextInt(100), UUID.randomUUID().toString());
  }

  @Override public String toString() {
    return "WeatherData [temperature=" + temperature + ", humidity=" + humidity + ", date=" + date + "]";
  }

  @Override public boolean equals(Object obj) {
    if (obj instanceof WeatherData) {
      WeatherData other = (WeatherData) obj;
      return date.equals(other.date) && temperature == other.temperature && humidity == other.humidity;
    }
    return false;
  }
}
