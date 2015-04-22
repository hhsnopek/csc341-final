package superAlarmClock;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClockDisplaySim {

	private boolean yellowAlertOn;
	private boolean redAlertOn;
	private boolean awake;
	private boolean alarmOn;
	
	private DayRecord todaysSchedule; 

	private int nextAlarmTime;

	private ClockController clockController;

	public ClockDisplaySim() {
		
	}

	public void runSim(int numDaysToSim, int timeStepsInMilliSec) {

		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar numDaysToSimulate = new GregorianCalendar();

		numDaysToSimulate.add(GregorianCalendar.DATE, numDaysToSim);

		while (now.before(numDaysToSimulate)) {
			now.add(GregorianCalendar.MINUTE, 60);
			Date dateObject = now.getTime();
			System.out.println(consoleClockDisplay(dateObject));
			pauseSim(timeStepsInMilliSec);
		}
	}

	private String consoleClockDisplay(Date dateObject) {
		String returnString = "";		

		returnString += simpleTimeString(dateObject);		

		return returnString;
	}

	private void pauseSim(int milliSecToPause){
		try {
			Thread.sleep(milliSecToPause);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught in pauseSim()");			
			e.printStackTrace();
		}
	}
	
	private String simpleTimeString(Date dateToFormat) {
		String returnString = "";
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df1.format(dateToFormat);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);
		String s2 = df2.format(dateToFormat);

		returnString += String.format("%s %9s", s1, s2);

		return returnString;
	}

	public void ShutOffAlarm() {
		if(alarmOn)
			alarmOn = false;
	}

	/**
	 *  
	 */
	public void toggleWakeSleep() {
		awake = !awake;
	}

	/**
	 *  
	 */
	private void getNextAlarmTime() {
		
	}

	/**
	 *  
	 */
	public void setNextAlarmTime() {

	}

}
