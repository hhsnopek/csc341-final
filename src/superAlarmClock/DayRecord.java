package superAlarmClock;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;

public class DayRecord {

	private Date wakeTimeRecomended;
	private Date sleepTimeRecomended;
	private Date dayRecordDate;
	private Date toggleWakeSleepTime;
	private LinkedList useOfRecordList;
	private LinkedList<Date>  additionalAlarmTime;
	private ClockController clockController;

	private String simpleTimeString(Date dateToFormat) {
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);

		String s1 = df1.format(dateToFormat);
		String s2 = df2.format(dateToFormat);

		return String.format("%s %9s", s1, s2);
	}
}