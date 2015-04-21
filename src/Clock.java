
public class Clock {
  private GerogianCalendar Time = new GerogianCalendar();
  Queue<Event> Events = new Queue<Event>();

  // To Wake up
  public void addAlarm(Event event) {
    addListener(event);
  }

  // To Sleep
  public void addReminder(Event event) {
    addListener(event);
  }

  // add's listener to Time
  private void addListener(Event event) {

  }

  // record time
  // used to record time before sleeping
  // on wake up & if it was from an alarm or not
  public void record(String msg) {
    // send POST request with event + timestamp
  }

  // notify when or need to sleep
  // Yellow (when to sleep)
  // Red (need to sleep)
  // Notify person after 3 red alerts (Event)
  public void notify(String msg) {

  }

  // update Time
  private void iterate() {
    while (true) {
      Time.update();
    }
  }

}
