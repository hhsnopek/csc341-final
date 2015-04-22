package superAlarmClock;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class DayRecord {

	private Date wakeTimeRecomended;
	private Date sleepTimeRecomended;
	
	private Date dayRecordDate;

	private Date toggleWakeSleepTime;

	private HashMap<Date, String> useOfRecordList;

	private LinkedList<Date>  additionalAlarmTime;
	private ClockController clockController;

	public DayRecord(){
		useOfRecordList = new HashMap<Date, String>();
		useOfRecordList.put(getCurrentDateTime(), "RecordCreated");
	}
	
	private Date getCurrentDateTime(){
		Date returnDate = new Date();
		return returnDate;
	}
	
	private String simpleTimeString(Date dateToFormat) {
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);

		String s1 = df1.format(dateToFormat);
		String s2 = df2.format(dateToFormat);

		return String.format("%s %9s", s1, s2);
	}

	public Date getWakeTimeRecomended() {
		return wakeTimeRecomended;
	}

	public void setWakeTimeRecomended(Date wakeTimeRecomended) {
		this.wakeTimeRecomended = wakeTimeRecomended;
	}

	public Date getSleepTimeRecomended() {
		return sleepTimeRecomended;
	}

	public void setSleepTimeRecomended(Date sleepTimeRecomended) {
		this.sleepTimeRecomended = sleepTimeRecomended;
	}

	public Date getDayRecordDate() {
		return dayRecordDate;
	}

	public void setDayRecordDate(Date dayRecordDate) {
		this.dayRecordDate = dayRecordDate;
	}

	public Date getToggleWakeSleepTime() {
		return toggleWakeSleepTime;
	}

	public void setToggleWakeSleepTime(Date toggleWakeSleepTime) {
		this.toggleWakeSleepTime = toggleWakeSleepTime;
	}

	public LinkedList getUseOfRecordList() {
		return useOfRecordList;
	}

	public void setUseOfRecordList(LinkedList useOfRecordList) {
		this.useOfRecordList = useOfRecordList;
	}

	public LinkedList<Date> getAdditionalAlarmTime() {
		return additionalAlarmTime;
	}

	public void setAdditionalAlarmTime(LinkedList<Date> additionalAlarmTime) {
		this.additionalAlarmTime = additionalAlarmTime;
	}

	public ClockController getClockController() {
		return clockController;
	}

	public void setClockController(ClockController clockController) {
		this.clockController = clockController;
	}
}
