package clock;

import java.util.Date;

public class Records {
  Date time = null;
  String event = null;
  String clockStatus = null;

  public Records(Date time, String event, String clockStatus) {
    this.time = time;
    this.event = event;
    this.clockStatus = clockStatus;
  }

  public Date getTime() {
  	return time;
  }

  public void setTime(Date time) {
  	this.time = time;
  }

  public String getEvent() {
  	return event;
  }

  public void setEvent(String event) {
  	this.event = event;
  }

  public String getClockStatus() {
  	return clockStatus;
  }

  public void setClockStatus(String clockStatus) {
  	this.clockStatus = clockStatus;
  }
}
