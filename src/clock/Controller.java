package clock;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;

import clock.Interface;

public class Controller {
	
	
	String dataServerConnection;
	Records outgoingRecords;
	Alarms alarms;
	Interface userView;
	
	Controller(){		
	}
	
	public void runClock(){

		userView = new Interface();	
		
		// while ... loop until ClockView is shutdown.
		// if current time is past previous alarm turnOnAlarm.
		// while time to next alarm is less than x, attempt to update sleepRemindTime from database.
		// wait for signal ClockView
		// act on signal
		// wait until next alarm time has passed.
		// repeat
		// 
	}
		
	private void turnOnAlarm(){
		// turn on alarm by type
	}

	private void recordEvent(Date time, String userAction, String clockStatus){		
	}
	
	private boolean getNextSleepRecomendationFromServer(){
		boolean recievedNewAlarmTime = false;
		// call on server for next recomended sleep time insert into alarms		
		return recievedNewAlarmTime;
	}
	

	private boolean postToServer(String dataServerConnectionData, Records recordsToPost) {
		boolean serverAcceptedState = false;
		// TODO use dataServerConnectionData to send recordsToPost to server.
		// If server excepted recordsToPost clear recordsToPost.
		return serverAcceptedState;

	}	
}


class TimeSimulator {

	public TimeSimulator() {
	}

	public void runSim(int numDaysToSim, int timeStepsInMilliSec) {

		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar numDaysToSimulate = new GregorianCalendar();

		numDaysToSimulate.add(GregorianCalendar.DATE, numDaysToSim);

		while (now.before(numDaysToSimulate)) {
			now.add(GregorianCalendar.MINUTE, 60);
			Date dateObject = now.getTime();
			System.out.println(simpleTimeString(dateObject));
			pauseSim(timeStepsInMilliSec);
		}
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
}


