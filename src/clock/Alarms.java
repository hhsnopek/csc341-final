package clock;

// Alarms holds all alarms created until it executes
public class Alarms {
	private Alarm[] alarms = {};

	// Adds alarm in the correct spot
	// Alarm[] is a sorted array
	public void add(Alarm alarm) {

	}

	// Removes most current alarm
	public void remove() {

	}

	// Returns next alarm to execute
	public Alarm getNext() {
		return new Alarm(null, null);
	}
}
