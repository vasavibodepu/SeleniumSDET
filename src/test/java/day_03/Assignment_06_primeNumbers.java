package day_03;

public class Assignment_06_primeNumbers {
	/*    Please write java program to find the first 30 prime numbers. 
	 * Hint : for loop and multiple if-else */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Prime Numbers : ");
		System.out.print("2,");
		
		int counter = 0;
		

		for (int numberToCheck=3; counter < 30; numberToCheck++) {
			// find if i is a prime number
			int index = numberToCheck/2;
			int j;
			boolean isNotPrime = false;
			for (j=2; j <= index; j++) {
				
				if (numberToCheck%j == 0) {
					isNotPrime = true;
					break;
				}
			}
			
			if (!isNotPrime) {
				counter ++;
				System.out.print(numberToCheck + ", ");
			}
			
		}
		
	}
	

}
