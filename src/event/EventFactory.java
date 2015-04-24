package event;

import java.util.Date;

public class EventFactory {
  public Event getEvent(String type, Date time, String action, String entity) {
    if (type == null) return null;

    if(type.equalsIgnoreCase("alarm")){
       return new Alarm(time, action, entity);

    } else if(type.equalsIgnoreCase("alert")){
       return new Alert(time, action, entity);

    } else if(type.equalsIgnoreCase("reminder")){
       return new Reminder(time, action, entity);
    }

    return null;
  }
}
