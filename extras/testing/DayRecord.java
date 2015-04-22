package testing;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;

public class DayRecord {

	private Date wakeTimeRecomended;
	private Date sleepTimeRecomended;
	private Date dayRecordDate;
	private LinkedList useOfRecordList;
	private Date toggleWakeSleepTime;
	private LinkedList<Date>  additionalAlarmTime;
	private ClockController clockController;
	
	private String simpleTimeString(Date dateToFormat) {
		String returnString = "";
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df1.format(dateToFormat);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);
		String s2 = df2.format(dateToFormat);

		returnString += String.format("%s %9s", s1, s2);

		return returnString;
	}
}
