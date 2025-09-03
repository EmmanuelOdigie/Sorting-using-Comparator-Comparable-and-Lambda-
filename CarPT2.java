package JavaAdvancedSorting; // project made in eclipse

import java.util.ArrayList; // imported ArrayList class
import java.util.Collections; // imported Collections class

class CarPT2 { // class CarPT2 made
	public String brand; //public String variable 'brand' made
	public String model;//public String variable 'model' made
	public int year;//public int variable 'year' made
	
public CarPT2(String b, String m, int y) { // constructor made
	brand = b; 
	model = m;
	year = y;
	}
}

public class Main { // created public class Main
	public static void main(String[] args) {// reads, runs & executes code
		ArrayList<CarPT2> myNewCars = new ArrayList<CarPT2>(); // object created
		
	// used object 'myNewCars' and called onto the '.add' method and information then taken from
	// constructor CarPT2 and put into object 'myNewCars'
		myNewCars.add(new CarPT2("BMW", "M3", 1988)); 
		myNewCars.add(new CarPT2("MAZDA", "3", 2010));
		myNewCars.add(new CarPT2("BMW", "M3", 1988));
		
	// Collections.sort is used to sort the list 
		Collections.sort(myNewCars, (obj1, obj2) -> {
			CarPT2 a = (CarPT2) obj1;
			CarPT2 b = (CarPT2) obj2;
			if(a.year<b.year) return -1; //  if a.year is more than b.year 'a' should be at top list 
			// due to the year being longer
			if(a.year>b.year)return 1; // if a.year is less than b.year 'a' should at bottom list as
			// it's the newest
			return 0; // no change if there the same year - return 0	
		});
	
		for(CarPT2 c : myNewCars) { // data in object 'myNewCars' is passed down to variable 'c' 
			//made by CarPT2
			System.out.println(c.brand + " " + c.model + " " + c.year); // display results
		}
		

	}

}

// Result:
// BMW M3 1988
//BMW M3 1988
// MAZDA 3 2010