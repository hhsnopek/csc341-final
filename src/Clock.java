package assign10v1i2;

import java.util.LinkedList;

public class Clock {
	//TODO private GerogianCalendar Time = new GerogianCalendar();
  LinkedList<Event> Events = new LinkedList<Event>();

  //TODO To Wake up
  public void addAlarm(Event event) {
    addListener(event);
  }

  //TODO To Sleep
  public void addReminder(Event event) {
    addListener(event);
  }

  //TODO add's listener to Time
  private void addListener(Event event) {

  }

  //TODO record time
  //TODO used to record time before sleeping
  //TODO on wake up & if it was from an alarm or not
  public void record(String msg) {
    // send POST request with event + timestamp
  }

  //TODO notify when or need to sleep
  //TODO Yellow (when to sleep)
  //TODO Red (need to sleep)
  //TODO Notify person after 3 red alerts (Event)
  public void notify(String msg) {

  }

  //TODO update Time
  private void iterate() {
    while (true) {
      //TODO Time.update();
    }
  }

}
