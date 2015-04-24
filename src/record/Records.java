package record;

import java.util.Iterator;
import java.util.Stack;

// High-level wrapper that holds all local records
public class Records {
  // The latest record is at the back of the Stack
  private Stack<Record> records = new Stack<Record>();
  private int length = 0;

  public void add(Record record) {
    records.add(record);
    length++;
  }

  public void remove(int i) {
    records.remove(i);
    length--;
  }

  public Iterator<Record> iterator() {
    return records.iterator();
  }

  public int getLength() {
    return length;
  }
}
