package haosTearDownOfDesignPatterns;
import java.util.*;

public class StatePattern {
	public static void main(String[] args) {
		PriorityMailHandler handler = new PriorityMailHandler();
		handler.addMail(new PriorityMail());
		handler.addMail(new PriorityMail());
		handler.checkStatus();
		handler.clearUp();
	}
}

enum MState{
	INITIAL, InPROCESS, FINAL, NULL
}

abstract class MailingState{
	protected MState s;
	public MState getStateConstant() {  return s; }
	public void setStateConstant(MState s) { this.s = s; 	}
	public abstract void informCustomer();
	public abstract void transition(PriorityMail mail);
}

class InitialState extends MailingState{	
	public InitialState(){ this.s = MState.INITIAL; }	
	@Override
	public void informCustomer() {
		System.out.println("Your priority mail has been processed...");
	}
	@Override
	public void transition(PriorityMail mail) {
		mail.setState( new InProcessState() );
		mail.setStateConstant(MState.InPROCESS);
	}	
}

class InProcessState extends MailingState{
	@Override
	public void informCustomer() {
		System.out.println("Your priority mail is being delivered...");
	}
	@Override
	public void transition(PriorityMail mail) {
		mail.setState( new FinalsState() );
		mail.setStateConstant(MState.FINAL);
	}	
}
class FinalsState extends MailingState{
	@Override
	public void informCustomer() {
		System.out.println("Your priority mail has arrived at its destination...");
	}
	@Override
	public void transition(PriorityMail mail) {
		mail.setState( new NullState() ); 
		mail.setStateConstant(MState.NULL);
	}	
}
class NullState extends MailingState{
	@Override
	public void informCustomer() {
		System.out.println("It's null state...");
	}

	@Override
	public void transition(PriorityMail mail) {
		mail.setState( new InitialState() ); 
		mail.setStateConstant(MState.NULL);
	}	
}

class PriorityMail{
	MailingState state;
	public MailingState getState() { return state; }
	public void setState(MailingState state) { this.state = state; }	
	public void setStateConstant(MState s){ state.setStateConstant(s); }
	public MState getStateConstant(){ return state.getStateConstant(); }
	public void informCustomer(){ state.informCustomer(); }
	public void transitionToNextState(){
		state.transition(this);
	}
	public double getMailingCharge(String zip){ return 0.0; }
}

class PriorityMailHandler{
	ArrayList<PriorityMail> list;
	public PriorityMailHandler(){ list = new ArrayList<PriorityMail>(); }
	public void addMail(PriorityMail mail){
		mail.setState(new InitialState());
		mail.informCustomer();
		list.add(mail);
	}	
	public void checkStatus(){
		for(int i = 0; i < list.size(); i++){
			PriorityMail mail = list.get(i);
			if(mail.getStateConstant() == MState.INITIAL){
				mail.transitionToNextState();
				mail.informCustomer();
			}
			if( hasArrived( mail ) ) {
				mail.transitionToNextState();	
				mail.informCustomer();				
			}
		}
	}	
	public void clearUp(){
		for(int i = 0; i < list.size(); i++){
			PriorityMail mail = list.get(i);
			if(mail.getStateConstant() == MState.FINAL){
				mail.transitionToNextState();
			}
		}
	}
	public boolean hasArrived(PriorityMail mail){ return true; }
}




