package clock;

import java.util.Date;
import java.util.GregorianCalendar;
import event.Event;
import event.SortedList;

// Controller
public class Timeline {
	SortedList<Event> events = new SortedList<Event>();


	public Timeline() {
			//	Upon initialization of the Timeline it will:
			//	- Sync with system clock
			//	- add events to timeline
			//	- timeline is a loop with the GregorianCalendar updates, everytime
			//		it updates it will check the top event

	}

	// Add's Event to timeline
	public void add() {

	}

	// Remove Event from timeline
	public void remove() {

	}
}
