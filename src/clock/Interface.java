package clock;

public class Interface {

  public void setAlarm(Date date) {

  }
}

class Button {
  private String name = null;

  public Button(String name) {
    this.name = name;

    switch (name) {
      case "set": {
        // interaction start
      }
      case "sleep": {
        // toggle style
      }
      case "alarmOff": {
        // clicker
      }
    }
  }
}
