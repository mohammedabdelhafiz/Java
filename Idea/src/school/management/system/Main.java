package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Teacher Ahmad = new Teacher(1,"ahmad",3000);
		Teacher Sayf = new Teacher (2,"Sayf", 4500);
		List<Teacher> teacherlist = new ArrayList<>();
		teacherlist.add(Ahmad);
		teacherlist.add(Sayf);
		
		
		Student Maarouf = new Student (1,"Maarouf" , 3);
		Student Tamasha = new Student (2,"Tamasha" , 4);
		
		
		List<Student> studentlist = new ArrayList<>();
		studentlist.add(Maarouf);
		studentlist.add(Tamasha);
		
		School school = new School(teacherlist,studentlist);
		
		
		Tamasha.payFees(5000);
		Maarouf.payFees(7000);
		System.out.println("The School has earned $" + school.getTotalMoneyEarned());
		
		
		
		System.out.println("-----Making School Paying Salary");
		Sayf.recieveSalary(4500);
		System.out.println("The School has spent salary to" + Sayf.getName()
		+ "and has now in $" + school.getTotalMoneyEarned());
		
	}

}
