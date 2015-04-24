package clock;

import java.util.Date;
import java.util.GregorianCalendar;
import event.Event;
import event.EventList;

// Controller
public class Timeline {
	EventList<Event> events = new EventList<Event>();


	public Timeline() {
			//	Upon initialization of the Timeline it will:
			//	- Sync with system clock
			//	- add events to timeline
			//	- timeline is a loop with the GregorianCalendar updates, everytime
			//		it updates it will check the top event
			//	- once event occurs it will be removed from the timeline

	}

	// Add's Event to timeline
	public void add() {

	}

	// Remove Event from timeline
	public void remove() {

	}
}
