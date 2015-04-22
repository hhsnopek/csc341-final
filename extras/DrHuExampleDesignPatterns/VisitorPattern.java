package DrHuExampleDesignPatterns;
import java.util.*;

public class VisitorPattern {
	public static void main(String[] args) {
		StudentAffairs sf = new StudentAffairs();
		System.out.println(sf.assignDorms(new DormAssignmentVisitor()));
	}
}

class StudentAffairs{
	ArrayList<CollegeStudent> students;
	public StudentAffairs(){
		students = new ArrayList<CollegeStudent>();	
		students.add(new PartTimeStu("Mike", 2));
		students.add(new FullTimeStu("Beth", 3));
		students.add(new NonDegreeStu("Nate", 2));
	}
	
	public String assignDorms(Visitor visitor){
		for(int i = 0; i < students.size(); i++) students.get(i).accept(visitor);
		return  visitor.getReport();
	}
}

interface Visitor {
	  public void visit(FullTimeStu ft);
	  public void visit(PartTimeStu pt);
	  public void visit(NonDegreeStu nd);
	  public String getReport();
}

class DormAssignmentVisitor implements Visitor{
	String report = "";
	@Override
	public void visit(FullTimeStu ft) {
		report += ft.name + ": yes, student is eligible\n";
	}

	@Override
	public void visit(PartTimeStu pt) {
		if(pt.year > 3)
			report += pt.name + ": this student is senior, and is eligible for a dorm room\n";
		else 
			report += pt.name + ": this student is not eligible\n"; 
	}

	@Override
	public void visit(NonDegreeStu nd) {
		report += nd.name + ": this student is not eligible\n"; 
	}
	public String getReport(){ return report; }
}

abstract class CollegeStudent{
	String name;
	int year;
	public CollegeStudent(String n, int y){ name = n; year = y; }
	public abstract void accept(Visitor v);
}

class FullTimeStu extends CollegeStudent{
	public FullTimeStu(String n, int y) {
		super(n, y);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}	
}

class PartTimeStu extends CollegeStudent{
	public PartTimeStu(String n, int y) {
		super(n, y);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}	
}
class NonDegreeStu extends CollegeStudent{
	public NonDegreeStu(String n, int y) {
		super(n, y);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}	
}


