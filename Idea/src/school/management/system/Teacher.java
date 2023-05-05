package school.management.system;

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	public Teacher(int id, String name , int salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;  // salary of the teacher changes frequently.
		this.salaryEarned=0;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
//	we dont set setter for ID and Name for
//	teacher becuase they will not
//	change but the salary might.
	

	public void setSalary(int salary) {
		this.salary=salary;	
		
		
	}
	
	
	public void recieveSalary(int salary) { //removes from the total money earned from school
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}
	
	
}