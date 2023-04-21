package day04;

import java.util.HashMap;
import java.util.Scanner;

public class RestaurantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//populateVegMenu();
		//populateNonVegMenu();
		HashMap vegMenu = new HashMap<Integer, RestaurantMenu> ();
		HashMap nonVegMenu = new HashMap<Integer, RestaurantMenu> ();

		Scanner orderScanner = new Scanner(System.in);
		System.out.print("Please enter the option – ");
		int menuOption = orderScanner.nextInt();
		
		processUserOrder(vegMenu, nonVegMenu, orderScanner, menuOption);
		
		
		//System.out.println();

	}

	private static void processUserOrder(HashMap vegMenu, HashMap nonVegMenu, Scanner orderScanner, int menuOption) {
		if (menuOption == 1) {
			
			populateVegMenu(vegMenu);
			processSelectedMenu(vegMenu, orderScanner);			
		} 
		else if (menuOption == 2) {
			populateNonVegMenu(nonVegMenu);
			processSelectedMenu(nonVegMenu, orderScanner);			
		}
		else 
			System.out.println("Invalid Menu option selected.");
	}

	private static void processSelectedMenu(HashMap vegMenu, Scanner orderScanner) {
		System.out.print("Please enter the option – ");
		Integer foodItemNo = orderScanner.nextInt();
		
		RestaurantMenu userChoosenItem = (RestaurantMenu)vegMenu.get(foodItemNo);
		System.out.print("Please enter number of \"" + userChoosenItem.getItemName()  + "\" you would like to order - ");
		
		Integer foodQuantity = orderScanner.nextInt();
		userChoosenItem.setItemQuantity(foodQuantity);
				
		vegMenu.put(foodItemNo, userChoosenItem);
		
		double totalCost = userChoosenItem.getItemQuantity()*userChoosenItem.getItemPrice();
		System.out.println("Total cost :" + totalCost);
		
		double gst = totalCost*.06;
		System.out.println("GST tax :" + gst);

		double takeAwayCharge = 30;
		
		double grandTotal	 = totalCost + gst + takeAwayCharge;
		System.out.println("Total bill amount : " + grandTotal);
		
		double discount = 0;
		if (grandTotal >= 1000 && grandTotal <= 1500) {
			discount = grandTotal * .10;
		} else if (grandTotal > 1500) {
			discount = grandTotal * .15;
		}
		
		if (discount > 0) {
			System.out.println("Discount : " + discount);
		}
		
		double netBillAmount = grandTotal-discount;
		System.out.println("Net bill amount : : " + netBillAmount);
	}

	private static void populateVegMenu(HashMap vegMenu) {
		
		RestaurantMenu vegItem1 = new RestaurantMenu(1, 1);
		vegItem1.setItemName("Paneer tikka");
		vegItem1.setItemPrice(120.00);
		vegMenu.put(vegItem1.getItemNo(), vegItem1);

		RestaurantMenu vegItem2 = new RestaurantMenu(1, 2);
		vegItem2.setItemName("Cashew pulao");
		vegItem2.setItemPrice(150.00);
		vegMenu.put(vegItem2.getItemNo(), vegItem2);

		RestaurantMenu vegItem3 = new RestaurantMenu(1, 3);
		vegItem3.setItemName("Veg fried rice");
		vegItem3.setItemPrice(130.00);
		vegMenu.put(vegItem3.getItemNo(), vegItem3);

		RestaurantMenu vegItem4 = new RestaurantMenu(1,4 );
		vegItem4.setItemName("Gobi 65");
		vegItem4.setItemPrice(100.00);
		vegMenu.put(vegItem4.getItemNo(), vegItem4);

		RestaurantMenu vegItem5= new RestaurantMenu(1,5 );
		vegItem5.setItemName("Veg thali");
		vegItem5.setItemPrice(140.00);
		vegMenu.put(vegItem5.getItemNo(), vegItem5);
		
		System.out.println();

		System.out.println(vegItem1);
		System.out.println(vegItem2);
		System.out.println(vegItem3);
		System.out.println(vegItem4);
		System.out.println(vegItem5);
	}
	
	
	private static void populateNonVegMenu(HashMap nonVegMenu) {

		RestaurantMenu nonVegItem1 = new RestaurantMenu(2, 1);
		nonVegItem1.setItemName("Chicken briyani");
		nonVegItem1.setItemPrice(200.00);
		nonVegMenu.put(nonVegItem1.getItemNo(), nonVegItem1);

		RestaurantMenu nonVegItem2 = new RestaurantMenu(2, 2);
		nonVegItem2.setItemName("Fish curry");
		nonVegItem2.setItemPrice(150.00);
		nonVegMenu.put(nonVegItem2.getItemNo(), nonVegItem2);

		RestaurantMenu nonVegItem3 = new RestaurantMenu(2, 3);
		nonVegItem3.setItemName("Chicken 65");
		nonVegItem3.setItemPrice(120.00);
		nonVegMenu.put(nonVegItem3.getItemNo(), nonVegItem3);
			
		RestaurantMenu nonVegItem4 = new RestaurantMenu(2,4 );
		nonVegItem4.setItemName("Mutton gravy");
		nonVegItem4.setItemPrice(220.00);
		nonVegMenu.put(nonVegItem4.getItemNo(), nonVegItem4);

		RestaurantMenu nonVegItem5= new RestaurantMenu(2,5 );
		nonVegItem5.setItemName("Chicken fried rice");
		nonVegItem5.setItemPrice(180.00);
		nonVegMenu.put(nonVegItem5.getItemNo(), nonVegItem5);
		
		System.out.println(nonVegItem1);
		System.out.println(nonVegItem2);
		System.out.println(nonVegItem3);
		System.out.println(nonVegItem4);
		System.out.println(nonVegItem5);
	}

}
