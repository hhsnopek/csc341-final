package haosTearDownOfDesignPatterns;
import java.util.*;

public class ObserverPattern {
	public static void main(String[] args) {
		AcademicEventMonitor monitor = new AcademicEventMonitor();
		IObserver ob1 = new RegistrarOffice();
		IObserver ob2 = new FinancialOffice();
		monitor.addEventListener(ob1);
		monitor.addEventListener(ob2);
		AcademicEvent event  =  new AcademicEvent("withdrawCourse");
		monitor.setEvent(event);
	}
}

class AcademicEventMonitor {
	private ArrayList<IObserver> observerList;
	AcademicEvent event;
	public AcademicEventMonitor(){ observerList = new ArrayList<IObserver>(); }
	public void addEventListener(IObserver observer) {
		observerList.add(observer);
	}
	public void removeEventListener(IObserver observer) {
		observerList.remove(observer);
	}
	public void setEvent(AcademicEvent e) {
		this.event = e;
		informListeners();
	}
	public AcademicEvent getEvent(){ return event; }
	
	private void informListeners() {
		for (IObserver item: observerList) {
			item.update(getEvent());
		}
	}
}


class AcademicEvent{
	String eventName;
	CarrollStudent currentStudent;
	
	public AcademicEvent(String event){ 
		currentStudent = new CarrollStudent(); 
		eventName = event;
	}
	public void setStudent(CarrollStudent s){
		currentStudent = s;
	}
	public void setEvenName(String n){
		eventName = n;
	}
}

class CarrollStudent{
	String name = "Evan";
}

interface IObserver {
	void update(AcademicEvent e);
}

class RegistrarOffice implements IObserver {
	private CarrollStudent currentStudent;
	public CarrollStudent getCurrentStudent() {
		return currentStudent;
	}
	public void setCurrentStudent(CarrollStudent s) {
		this.currentStudent = s;
	}
	public void update(AcademicEvent e) {
		CarrollStudent s = e.currentStudent;
		setCurrentStudent(s);
		System.out.println("Registrar office received " + e.eventName + " event about student " + s.name + " & updated the student record..");
	}
}

class FinancialOffice implements IObserver {
	private CarrollStudent currentStudent;
	public CarrollStudent getCurrentStudent() {
		return currentStudent;
	}
		public void setCurrentStudent(CarrollStudent s) {
		this.currentStudent = s;
	}
	public void update(AcademicEvent e) {
		CarrollStudent s = e.currentStudent;
		setCurrentStudent(s);
		System.out.println("Financial office received " + e.eventName + " event about student " + s.name + " & updated the student record..");
	}
}





