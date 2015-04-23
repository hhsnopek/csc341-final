package clock;

import java.util.Date;

public class Record {
	Date time = null;
	String userAction = null;
  String clockStatus = null;

	// You cannot get or set a record because it's the state.
	// No modifying the record
  public Record(Date time, String userAction, String clockStatus) {
    this.time = time;
    this.userAction = userAction;
    this.clockStatus = clockStatus;
  }
}
