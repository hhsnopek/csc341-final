package asg10v1;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimulatedSuperAlarm {

		public SimulatedSuperAlarm() {
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
