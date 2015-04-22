package superAlarmClock;

public class ClockController {
	private DayRecord currentSchedule;
	private ClockDisplaySim clockDisplaySim;
	
	public DayRecord getCurrentSchedule() {
		return currentSchedule;
	}
	
	public void setCurrentSchedule(DayRecord currentSchedule) {
		this.currentSchedule = currentSchedule;
	}
	
	public ClockDisplaySim getClockDisplaySim() {
		return clockDisplaySim;
	}
	
	public void setClockDisplaySim(ClockDisplaySim clockDisplaySim) {
		this.clockDisplaySim = clockDisplaySim;
	}
}
