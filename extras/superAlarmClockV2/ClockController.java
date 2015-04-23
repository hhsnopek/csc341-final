package superAlarmClockV2;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class ClockController {
	
	Date nextAlarm, previouseAlarm, userAlarm;
	int numWarningMinutes;
	
	String dataServerConnection;
	LinkedList<ClockState> outgoingStates;
	
	ClockView userView;
	
	ClockController(){
		
	}
	
	runClock(){
		// userView create
		// userView run
		
		// loop until ClockView is shutdown.
		
		// if current time is past previous alarm, insert next alarm.
		// wait for signal ClockView
		// act on signal 
		// 
	}
	
	private void insertNextAlarm(){
		// insert next alarm into clock
		// 
	}
	
	private getNextAlarmFrom
	
	private boolean  postOutgoingStateRecords(){
		boolean outgoingStatesPileIsEmpty = false;
		postToServer(dataServerConnection, outgoingStates.pop());
		return outgoingStates.isEmpty();
	}

	private void postToServer(String dataServerConnectionData, ClockState stateToPost) {
		// TODO use dataServerConnectionData to send stateToPost to server.		
	}	
}

class ClockState{
	String stateAlarmStatus;
	Date stateDateTime;
	String stateEvent;
	
	public ClockState(){
		stateDateTime = new Date();
	}
}
