package report;

public class SleepReport implements Report {
  private String sleepData = null;
  private String report = null;

  public SleepReport() {
    Build();
  }

  // builds the report
  public void Build() {

  }

  // returns report as a String
  public String toString() {
    return report;
  }

  // gets all sleep data from server
  private void getSleepData() {

  }

}
