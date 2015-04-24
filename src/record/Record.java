package record;

import java.util.Date;

public class Record {
  private Date time = null;
  private String entity = null;
  private String action = null;

  public Record(Date time, String entity, String action) {
    this.time = time;
    this.entity = entity;
    this.action = action;
  }

  public Date getTime() {
    return time;
  }

  public String getEntity() {
    return entity;
  }

  public String getAction() {
    return action;
  }

	// Setters are unsupported because after a record is made, it should not be
	// modified.
  public void setTime(Date time) {
    throw new UnsupportedOperationException("Unable to modify record");
  }

  public void setEntity(String entity) {
    throw new UnsupportedOperationException("Unable to modify record");
  }

  public void setAction(String action) {
    throw new UnsupportedOperationException("Unable to modify record");
  }

}
