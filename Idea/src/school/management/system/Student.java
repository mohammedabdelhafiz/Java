package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int  feesTotal;

	
	
	public Student(int id, String name , int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		feesPaid=0;
		feesTotal=30000; //the fees foe every student is 30,000$
	}
	
	
	// Not going to change the Student's ID NOR Name.
	
	
	public void setGrade(int grade) {
		this.grade=grade;

	}

 
	public void payFees(int fees) {  //we have to keep adding the fees to fees_paid field 
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
	}


	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}


	public int getGrade() {
		return grade;
	}
	
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}


}