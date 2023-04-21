package day_01;

import java.util.Scanner;

public class ScannerStudentMarks {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner studentMarks = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Student marks: ");

	   double science = studentMarks.nextInt();  // Read user input
	   double maths = studentMarks.nextInt();		
	   double english = studentMarks.nextInt();	
	   double social = studentMarks.nextInt();		
		
		System.out.println("Science : " + science);
		System.out.println("Maths : " + maths);
		System.out.println("English : " + english);
		System.out.println("Social : " + social);
		

}}
