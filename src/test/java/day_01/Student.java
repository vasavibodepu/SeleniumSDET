package day_01;

public class Student {
	
	double m1=99.7;
	double m2=98;
	double m3=45;
	double m4=90;
	double sum ;
	double average;
	
	
	public double calculateTotal() {
		
    this.sum  = m1+m2+m3+m4;
		
		return sum;

		}
	
public  double calculateAverage() {
		
	this.average = sum/4;
		
		return average;
		
		}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Student sum1 = new Student();

		System.out.println("Total sum of student marks is " + sum1.calculateTotal());
		System.out.println("Average of student marks is " + sum1.calculateAverage());


	}

}
