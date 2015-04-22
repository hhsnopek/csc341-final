package DrHuExampleDesignPatterns;
//Facade Pattern
public class FacadePattern {
	public static void main(String[] args) {
		DiplomaHandler handler = new DiplomaHandler();
		if(handler.handleGraduation(new Student()))
			System.out.println("Student is ready to graduate");
	}

}

class DiplomaHandler{
	Registrar registrar;
	BusinessOffice business;
	CommencementHandler agent; 
	public DiplomaHandler(){
		registrar = new Registrar();
		business = new BusinessOffice();
		agent = new CommencementHandler();
	}
	public boolean handleGraduation(Student s){
		if(registrar.hasAppliedForGraduation(s)){
			if(registrar.auditTranscript(s) && business.auditStudentDebts(s)){
				agent.orderDiploma();
				return true;
			}
		}
		return false;
	}
}

class Student{
	String name;
}
class Registrar{
	public boolean hasAppliedForGraduation(Student s){ return true; }
	public boolean auditTranscript(Student s){ return true; }
}
class BusinessOffice{
	public boolean auditStudentDebts(Student s){ return true; }
}
class CommencementHandler{
	public void orderDiploma(){ ; }
}


