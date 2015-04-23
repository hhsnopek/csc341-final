package clock;

import java.util.Date;

// No Getters or Setters required
public class Alarm {
  private Date time = null;
  private String type = null; // Remind, Recommendation, Wake

  public Alarm(Date time, String type) {
    this.time = time;
    this.type = type;
  }
}
