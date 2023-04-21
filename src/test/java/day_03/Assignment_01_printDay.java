package day_03;

public class Assignment_01_printDay {
	
	public void printDayOfTheWeek (int day) {
		
		switch (day){
		case 1: System.out.println("Sunday");
				break;
		case 2: System.out.println("Monday");
                break;
		case 3: System.out.println("Tuesday");
				break;
		case 4: System.out.println("Wednesday");
		        break;
		case 5: System.out.println("Thursday");
		        break;
		case 6: System.out.println("Friday");
		        break;
		case 7: System.out.println("Saturday");
		        break;
		default: System.out.println("Invalid day");

		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_01_printDay assignment1 = new Assignment_01_printDay(); //instantiating the class
		
		assignment1.printDayOfTheWeek (3);

	}

}
