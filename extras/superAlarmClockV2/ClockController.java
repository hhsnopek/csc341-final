package superAlarmClockV2;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

import clock.Interface;

public class ClockController {
	
	Date nextAlarm, previouseAlarm, userAlarm;
	int numWarningMinutes;
	
	String dataServerConnection;
	LinkedList<ClockState> outgoingStates;
	
	Interface userView;
	
	ClockController(){		
	}
	
	public void runClock(){

		// userView create
		// userView run		
		// loop until ClockView is shutdown.
		
		// if current time is past previous alarm, insert next alarm.
		// wait for signal ClockView
		// act on signal 
		// 
	}
	
	private void insertNextAlarm(ClockState blankState){
		// insert next alarm into clock
		// userView.getState();
		// userView.setState();
	}
	
	private boolean getNextAlarmFromServer(){
		boolean recievedNewAlarmTime = false;
		return recievedNewAlarmTime;
	}
	
	private boolean  postOutgoingStateRecords(String dataServerConnectionData, ClockState stateToPost){
		boolean outgoingStatesPileIsEmpty = false;
		
		while(postRecord(dataServerConnection, outgoingStates.pop()) == false){};
		
		return outgoingStates.isEmpty();
	}

	private boolean postToServer(String dataServerConnectionData, ClockState stateToPost) {
		boolean serverAcceptedState = false;
		// TODO use dataServerConnectionData to send stateToPost to server.	
		return serverAcceptedState;

	}	
}

class ClockState{
	String stateAlarmStatus;
	Date stateDateTime;
	String stateEvent;
	
	// Constructor
	public ClockState(){
		stateDateTime = new Date();
	}

	public String getStateAlarmStatus() {
		return stateAlarmStatus;
	}

	public void setStateAlarmStatus(String stateAlarmStatus) {
		this.stateAlarmStatus = stateAlarmStatus;
	}

	public Date getStateDateTime() {
		return stateDateTime;
	}

	public void setStateDateTime(Date stateDateTime) {
		this.stateDateTime = stateDateTime;
	}

	public String getStateEvent() {
		return stateEvent;
	}

	public void setStateEvent(String stateEvent) {
		this.stateEvent = stateEvent;
	}
	
	
}
