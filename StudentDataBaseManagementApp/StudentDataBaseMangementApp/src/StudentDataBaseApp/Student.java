package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    
	 private String firstName;
	 private String lastName;
	 
	 private String gradeYear;
	 private String studentId;
	 private String courses = "";
	 private int tuitionBalance;
	 private static int costOfCourse = 600;
	 private static int id = 1000;
	 
	 
	 // Constructor:  prompts user to entre name and year 
	 public Student() {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Entre Student FirstName : ");
		 this.firstName = scan.nextLine();
		 
		 System.out.println("Entre Student Last Name : ");
		 this.lastName = scan.nextLine();
		 
		 System.out.println("1-FreshMen\n2-Sophemore\n3-Junior\n4-Senior\nEntre the Student year : "); 
		 this.gradeYear = scan.next(); 
		 
		 setStudentID();
			 
//		 System.out.println("Name : " + firstName + " " + lastName + ", Grade year : " + gradeYear + 
//				 ", StudentId : " + studentId);
		
	 } 
	 
	 // Generate an id 
	  
	 private void setStudentID() {
		 	 
		 id++;
		 // Gradeyear + id
		  this.studentId = gradeYear+""+id;
	 }
	 
	 // enroll in courses  
	 public void enroll() {
		 
		 
		 do {
			 System.out.print("Entre the course you want to enroll(Q to Quit) : ");
			 Scanner scan = new Scanner(System.in);
			 String course = scan.nextLine();
			 
			 if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance += costOfCourse;
			 } else {
				 break;
			 }
		 
		 }
			 
			 while(1!=0); 
		 
	 //	 System.out.println("Enrolled in : " + courses);
        //  viewBalance();					
				
		}
	 
	 
	 // view balance 
	 public void viewBalance() {
		 System.out.println("Your Balance is : " + tuitionBalance);
	 }
	 
	 // Pay tuition 
	 public void payBalance(){
		 viewBalance();
		 System.out.println("Entre the amount you want to pay: " );
		 Scanner scan = new Scanner(System.in);
		 
		 int payment = scan.nextInt();
		 tuitionBalance -= payment;
		 System.out.println("Thank you for paying amount : " + payment);
		 viewBalance();
		 
	 }
	 
	 
	 // show status
	 public String showStatus() {
		 return "Name : " + firstName +" " +lastName  
				 + "\nCourses Enrolled : " + courses +
				  "\nstudentId : " + studentId +
				  "\nGrade Year : " + gradeYear +  
				   "\nBalance Remaning : " + tuitionBalance;
	 }
	 
}
