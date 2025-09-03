package JavaAdvancedSorting;
import java.util.ArrayList;// imported ArrayList class
import java.util.Collections;// imported Collections class
import java.util.Comparator;// imported Comparator class

public class CarPT3 implements Comparable { // public class 'CarPT3'is made, implements interface
	// Comparable
	
// variables of different data types made
	public String brand;
	public String model;
	public int year;
	
public CarPT3(String b, String m, int y) { // constructor made

// Assigned values / variables
	brand = b;
	model = m;
	year = y;
}

public int compareTo(Object obj1) { // used comparable method
	CarPT3 other = (CarPT3)obj1; // variable other is assigned to class CarPT3obj created
	
	// if year is less than the next car year added 
// it'll stay at the top of list due to return -1 and vice versa
	if(year<other.year) return -1; 
	if(year<other.year) return 1;
	return 0; // if years are the same returns 0, nothing will be done
}

	public static void main(String[] args) {// reads, run, executes code
		
	// object made from imported class named 'myCar'
		ArrayList<CarPT3> myCar = new ArrayList<CarPT3>(); 
		
	// details added into myCar object
		myCar.add(new CarPT3("BMW", "M3", 1988));
		myCar.add(new CarPT3("MAZDA", "3", 2010));
		myCar.add(new CarPT3("KALOS", "DAEWOO", 2003));
		
		Collections.sort(myCar); // calls the Collection imported class and calls onto the '.sort'
		// method, to organise the list
		
		for(CarPT3 c :myCar) { // data in object myCar is passed down to variable 'c'
			// made by class 
			System.out.println(c.brand + " " + c.model + " " + c.year); // display information
		}
		

	}

}

// result:
// BMW M3 1988
// KALOS DAEWOO 2003
// MAZDA 3 2010