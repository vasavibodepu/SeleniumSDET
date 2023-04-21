package day04;
import java.util.Scanner;
import java.util.HashMap;

public class Assignment_04_restaurantFoodOrder {
	
	public void category01() {
	
	HashMap<Integer, String> vegetarian = new HashMap<Integer, String>();
	
	vegetarian.put((int) 120.00, "Paneer tikka"); 
	vegetarian.put((int) 150.00, "Cashew pulao"); 
	printSummary(vegetarian);
	
	
	
	
	}
	
	
private void printSummary(HashMap<Integer, String> vegetarian) {
		// TODO Auto-generated method stub
		
	}


public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner foodOrder = new Scanner(System.in);{
    System.out.println("             Hello Welcome to Numpy Ninja restaurant !    ");
    System.out.println(" ");
    System.out.println("   Please select the service offering from below list :  ");
		}
		
		
		
    Assignment_04_restaurantFoodOrder veg = new Assignment_04_restaurantFoodOrder();
    veg.category01();
  
  //  for(int i=1;i<=n;i++) {
//		
//		System.out.println("please enter name - "+i);
//		String name = sc.next();
//		
//		Boolean isAddedSuccessfully = names.add(name);
//		
//		if(isAddedSuccessfully)
//			System.out.println("Student enrolled sucecssfully");
//		else
//			System.out.println("Student name is already present");
//		
//	}
//	
//	System.out.println("*********** The summary is ***********");
//	printSummary(names);
    
   
    
	}

}
