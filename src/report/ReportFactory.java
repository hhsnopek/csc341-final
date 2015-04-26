package report;

public class ReportFactory {
  public Report getReport(String type) {
    if (type == null) return null;

    if(type.equalsIgnoreCase("sleep-patterns")){
       return new SleepReport();

    }

    return null;
  }
}
