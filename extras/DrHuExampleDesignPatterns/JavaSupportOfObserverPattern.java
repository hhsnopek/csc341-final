package DrHuExampleDesignPatterns;
import java.util.*;

public class JavaSupportOfObserverPattern {
	public static void main(String[] args) {
		//********** Java support of observer pattern *********
		EventSource evSrc = new EventSource();
		 
        // create an observer
       	Registration regis = new Registration();
       	FinancialAid finanAid = new FinancialAid();
 
        // subscribe the observer to the event source
       	evSrc.addObserver( regis );
        evSrc.addObserver( finanAid );
 
        // starts the event thread
        Thread thread = new Thread(evSrc);
       	thread.start();
	}	
}

class EventSource extends Observable implements Runnable{
    public void run(){
    	final Scanner inReader; 
       	inReader = new Scanner(System.in); 
        	String evenName = "start";
       	while( !evenName.equals("stop") ){
        		evenName = inReader.nextLine();
            		setChanged();
            		notifyObservers( new AcademicEvent(evenName) );
        	}       
    }
}

class Registration implements Observer{
    private String eventN;
    public void update (Observable obj, Object arg){ 
    /*  obj would be an EvenSource object if used, and arg is the parameter object provided to “notifyObservers(Object arg)” */
        if (arg instanceof AcademicEvent){
            eventN = (String) ((AcademicEvent)arg).eventName;
            System.out.println("\nRegistrar received event: "+ eventN + " for processing...");
        }
    }
}
class FinancialAid implements Observer{
	private String eventN;
    public void update (Observable obj, Object arg){
    	System.out.println(obj.getClass());
    	if (arg instanceof AcademicEvent){
            eventN = (String) ((AcademicEvent)arg).eventName;
            System.out.println("\nFinancial Aid received event: " + eventN + " for processing..." );
    	}
    }
}

