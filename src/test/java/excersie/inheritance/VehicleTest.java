package excersie.inheritance;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle= new Vehicle();
		vehicle.color= "Yellow";
		vehicle.numberOfSeats= 5;
		vehicle.fuelType= "Electric";
		
		
		System.out.println("color : " + vehicle.color);
		System.out.println("numberOfSeats : " + vehicle.numberOfSeats);
		System.out.println("fuelType : " + vehicle.fuelType);
		
		
		Car myCar= new Car();
		System.out.println("Car numberOfSeats : " + myCar.numberOfSeats);
		System.out.println("Car fuelType : " + myCar.fuelType);
	
//System.out.println("Hello World");
}
	
	
}
