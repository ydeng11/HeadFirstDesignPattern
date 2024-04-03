import java.util.ArrayList;
import java.util.List;

public class NotificationCenterImpl implements NotificationCenter {
  private List<Observer> observers = new ArrayList<>();
  private static NotificationCenter instance;
  private NotificationCenterImpl() {}

  public static NotificationCenter getInstance() {
    if (instance == null) {
      instance = new NotificationCenterImpl();
    }
    return instance;
  }

  @Override public void addObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  @Override public void notifyObservers() {
    System.out.println("Receive weather data update event!");
    observers.forEach(observer -> observer.update());
  }
}
