package haosTearDownOfDesignPatterns;
//Decorator Pattern
public class DecoratorPattern {

	public static void main(String[] args) {
		IGymMembership basic = new BasicGymMembership("abc2014");
		IGymMembership premium = new PremiumGymMembership("eds2014", basic);
		premium.getMembershipDescription();
	}
}
interface IGymMembership{
	void getMembershipDescription();
}
class BasicGymMembership implements IGymMembership{
	String memberId;	
	public BasicGymMembership(String id){ memberId = id; }
	@Override
	public void getMembershipDescription() {
		System.out.println("Member: " + memberId + " has the following benefit:\n" +
				"use of all gym facilities.");
	}
}
class PremiumGymMembership implements IGymMembership{
	String memberId;
	IGymMembership basicMembership;
	public PremiumGymMembership(String id, IGymMembership basic){
		memberId = id;
		basicMembership = basic;
	}
	@Override
	public void getMembershipDescription() {
		this.basicMembership.getMembershipDescription();
		System.out.println("In addition, you can schedule personal trainning sessions for free.");
	}	
}
