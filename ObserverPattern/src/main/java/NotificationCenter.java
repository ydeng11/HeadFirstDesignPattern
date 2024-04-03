public interface NotificationCenter {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
