//Created by Justin Howlett
//Class Vehicle is used to find the range of a vehicle
//Range is found using class variable members and method member

class Vehicle {
	int passengers;		//variable to hold number of passengers
	int fuelcap;		//variables to calculate vehicle range
	int mpg;
	
	int range(){
		return mpg * fuelcap; //method to calculate range
	}
}
class VehicleDemo {
	public static void main(String args[]){
		
		Vehicle minivan = new Vehicle();	//creates vehicle named minivan
		Vehicle sportscar = new Vehicle();	//creates vehicle named sportscar
		int range1, range2;	//holds ranges for sportscar and minivan
		
		minivan.passengers = 7;		//sets stats for minivan
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;	//sets stats for sportscar
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.range();	//calculates range for minivan and sportscar
		range2 = sportscar.range();
		
		System.out.println("Minivan can carry " + minivan.passengers //displays information for both cars
						 + " with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscar.passengers 
						 + " with a range of " + range2);
	}
}