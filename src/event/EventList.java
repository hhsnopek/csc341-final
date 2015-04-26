package event;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EventList<Event> extends AbstractList<Event> {
  private ArrayList<Event> list = new ArrayList<Event>();

  @Override


  public boolean add(Event e) {
      list.add(e);

      // Sort list as we add them in by date/time so the most current is on top
      Collections.sort(list, new Comparator<Event>() {
          public int compare(Event e1, Event e2){
              return e1.compareTo(e2);
      }});

      return true;
  }

  @Override
  public Event get(int i) {
      return list.get(i);
  }

  @Override
  public int size() {
      return list.size();
  }
}
