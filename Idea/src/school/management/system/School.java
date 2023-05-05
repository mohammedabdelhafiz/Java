package school.management.system;

import java.util.List;

public class School {
	
	
	private List<Teacher> teachers; // the school will contain multiple teachers
	private List<Student> students;  // the school will contain multiple students
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	// school object is created as a constructor.
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}


	public List<Teacher> getTeachers() {  // list of teachers in the school
		return teachers;
	}


	public void addTeacher(Teacher teacher) {   // adds a teacher to the school
		teachers.add(teacher);
	}


	public List<Student> getStudents() {   // get the list of students in school
		return students;
	}


	public void addStudents(Student student) {  //add a student to the school
		students.add(student);
		
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void updateTotalMoneyEarned(int MoneyEarned) { // adds the total money by the school
		totalMoneyEarned+= MoneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}


	public static void updateTotalMoneySpent(int moneySpent) { //update the money spent in this case only to the teachers.
		totalMoneyEarned-=moneySpent;
	}
	
	 
	

}
