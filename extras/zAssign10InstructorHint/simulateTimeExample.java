package zAssign10InstructorHint;

import java.text.DateFormat;
import java.util.GregorianCalendar;

/**
 * @author Doctor Chenglie Hu Modified for use by Benjamin Haos with advice, thought and
 * inspiration provided by Henry Snopek.
 * 
 * Useful link provided by Dr. Hu:
 * 
 * Calculating Java dates - Take the time to learn how to create and use dates :
 * http://www.javaworld.com/article/2076270/core-java/calculating-java-dates.html
 * 
 * Working in Java time - Learn the basics of calculating elapsed time in Java
 * http://www.javaworld.com/article/2075174/core-java/working-in-java-time.html
 *
 */

public class simulateTimeExample {

	public static void main(String[] args) {
		TimeSimulator timer = new TimeSimulator();
		timer.runSim();
	}
}

class TimeSimulator{
	
	public TimeSimulator(){		
	}

public void runSim(){
		
		DateFormat df =  DateFormat.getDateInstance(DateFormat.SHORT);

		GregorianCalendar now = new GregorianCalendar();

		System.out.println(df.format(now.getTime()));

		GregorianCalendar oneDayLater =  new GregorianCalendar();

		oneDayLater.add(GregorianCalendar.DATE, 1);

		System.out.println(df.format(oneDayLater.getTime()));

		while( now.before(oneDayLater) ){
			now.add(GregorianCalendar.MINUTE, 60);
			System.out.println(now.getTime());
		}
	}
}

