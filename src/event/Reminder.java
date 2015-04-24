package event;

import java.util.Date;

public class Reminder implements Event {
  Date time = null;
  String action = null;
  String entity = null;

  public Reminder(Date time, String action, String entity) {
    this.time = time;
    this.action = action;
    this.entity = entity;
  }

  @Override
  public void Trigger() {
      // Trigger ActionEvent
      // ActionEvent's definition is action
   }

  @Override
  public int compareTo(Event o) {
	 return Comparators.NAME.compare(this, o);
  }
}
