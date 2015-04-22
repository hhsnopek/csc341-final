package DrHuExampleDesignPatterns;
import java.util.*;

public class Mediator {
	public static void main(String[] args) {
		IRealtor realtor = new Realtor();
		realtor.doMediation();
		((Realtor)realtor).displayLog();
	}
}

interface IRealtor{
	public void doMediation();
}

class Log{
	double currentAskingPrice;
	double currentOfferingPrice;
	String log = "";
	public void setOffer(double currentOfferingPrice, String message){
		log += "$" + currentOfferingPrice + message + "\n";
	}
	public void setCounterOffer(double currentAskingPrice, String message){
		log += "$" + currentOfferingPrice + message + "\n";
	}
	public String getLog(){ return log; }
}

class Realtor implements IRealtor { //mediator	
	Client buyer, seller;
	Log log;
	
	public Realtor(){
		buyer = new Client(this, "buyer");
		seller = new Client(this, "seller");
		log = new Log();
	}
	public void doMediation(){
		do{
			buyer.offer();
			log.setOffer(buyer.getPrice(), " Buyer message: " + buyer.getMessage());
			seller.offer();
			log.setOffer(seller.getPrice(), " Seller message: " + seller.getMessage());
		}while(!buyer.getMessage().equalsIgnoreCase("done") 
				&& !seller.getMessage().equalsIgnoreCase("done"));
	}
	public void displayLog() {
		System.out.println(log.getLog());
	}
}

class Client{
	IRealtor realtor;
	Scanner scanner;
	int offeringPrice;
	String message;
	String identity;
	
	public Client(IRealtor r, String iden){ 
		realtor = r;
		scanner = new Scanner(System.in);
		identity = iden;
	}
	public void offer(){
		System.out.println(identity + " Offer price: ");
		if(scanner.hasNextInt())
			offeringPrice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Message: ");		
		if(scanner.hasNextLine())
			message = scanner.nextLine();
		
	}
	public int getPrice(){ return offeringPrice; }
	public String getMessage(){ return message; }
}

