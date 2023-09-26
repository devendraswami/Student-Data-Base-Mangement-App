package StudentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {
		// Ask how many users we want to add 
		Scanner scan = new Scanner(System.in);
		 System.out.println("Entre the number of students : ");
		 int n = scan.nextInt();
		 Student stu[] =  new Student[n];
		 
		// Create n number of new students
		 for(int i = 0; i<n; i++) {
			 stu[i] = new Student();
			 stu[i].enroll();
			 stu[i].payBalance();
			 
		 }
		 
		
	
		 
		 for(int i = 0; i<n; i++) {
			 
			 System.out.println(stu[i].showStatus());
		 }
		 
	
		
		

	}

}
