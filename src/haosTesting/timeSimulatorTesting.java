package haosTesting;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Doctor Chenglie Hu Modified for use by Benjamin Haos with advice,
 *         thought and inspiration provided by Henry Snopek.
 * 
 *         Useful link provided by Dr. Hu:
 * 
 *         Calculating Java dates - Take the time to learn how to create and use
 *         dates :
 *         http://www.javaworld.com/article/2076270/core-java/calculating
 *         -java-dates.html
 * 
 *         Working in Java time - Learn the basics of calculating elapsed time
 *         in Java
 *         http://www.javaworld.com/article/2075174/core-java/working-in-
 *         java-time.html
 *
 */

public class timeSimulatorTesting {

	public static void main(String[] args) {
		TimeSimulator timer = new TimeSimulator();
		timer.runSim(1, 100);
		//timer.styleDateDemo();
		//timer.styleTimeDemo();
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

	/**
	 * Provided by :
	 * http://www.javaworld.com/article/2076270/core-java/calculating-java-dates.html
	 * 
	 */
	public void styleDateDemo() {
		Date now = new Date();
		DateFormat df = DateFormat.getDateInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		String s = df.format(now);
		String s1 = df1.format(now);
		String s2 = df2.format(now);
		String s3 = df3.format(now);
		String s4 = df4.format(now);
		System.out.println("(Default) = " + s);
		System.out.println("(SHORT)   = " + s1);
		System.out.println("(MEDIUM)  = " + s2);
		System.out.println("(LONG)    = " + s3);
		System.out.println("(FULL)    = " + s4);
	}

	/**
	 * Provided by :
	 * http://www.javaworld.com/article/2076270/core-java/calculating-java-dates.html
	 * 
	 */
	public void styleTimeDemo() {
		GregorianCalendar liftOffApollo11 = new GregorianCalendar(1969, Calendar.JULY, 16, 9, 32);
		Date d = liftOffApollo11.getTime();
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);
		String s1 = df1.format(d);
		String s2 = df2.format(d);
		System.out.println("styleTimeDemo");
		System.out.println("DateFormat.MEDIUM, DateFormat.MEDIUM = " + s1);
		System.out.println(s2);
	}
}
