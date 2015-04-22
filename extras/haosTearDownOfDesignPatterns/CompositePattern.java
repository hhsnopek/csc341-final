package haosTearDownOfDesignPatterns;

import java.util.*;

public class CompositePattern {

	public static void main(String[] args) {

		Employee employee1 = new Associate("Mary", "2345", "technician");
		Employee employee2 = new Associate("Mike", "3215", "Machine Operator");
		Employee employee3 = new Associate("Evan", "3231", "Sales");

		Employee bob = new Manager("Bob", "0000", "CEO", new Employee[] {

		new Manager("Joe", "1212", "production manager", new Employee[] { employee1, employee2 }),
				new Manager("Beth", "1234", "marketing manager", new Employee[] { employee3 }) });

		bob.doSurvey("Are you happy?");
	}
}

abstract class Employee {
	String name, employeeId;

	public Employee(String n, String id) {
		name = n;
		employeeId = id;
	}

	public abstract void doSurvey(String question);
}

class Associate extends Employee {
	String rank;

	public Associate(String n, String id, String rank) {
		super(n, id);
		this.rank = rank;
	}

	@Override
	public void doSurvey(String question) {
		System.out.println("I am " + this + ", I vote NO!");
	}

	public String toString() {
		return name + " " + rank;
	}
}

class Manager extends Employee {
	String rank;
	ArrayList<Employee> workersUnder;

	public Manager(String n, String id, String rank, Employee[] workers) {
		super(n, id);
		this.rank = rank;
		workersUnder = new ArrayList<Employee>();
		for (int i = 0; i < workers.length; i++) {
			workersUnder.add(workers[i]);
		}
	}

	@Override
	public void doSurvey(String question) {
		System.out.println("I am " + this + ", I vote YES!");
		for (int i = 0; i < workersUnder.size(); i++) {
			workersUnder.get(i).doSurvey(question);
		}
	}

	public String toString() {
		return name + " " + rank;
	}
}
