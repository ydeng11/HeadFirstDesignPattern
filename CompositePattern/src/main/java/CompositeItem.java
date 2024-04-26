import java.util.Iterator;

public abstract class CompositeItem {
  void addItem(CompositeItem item) {
    throw new UnsupportedOperationException();
  };
  boolean hasChildren() {
    throw new UnsupportedOperationException();
  };
  Iterator<CompositeItem> getItemIterator() {
    throw new UnsupportedOperationException();
  };
  void print() {
    throw new UnsupportedOperationException();
  };
}
