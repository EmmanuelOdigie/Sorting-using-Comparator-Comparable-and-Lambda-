package JavaAdvancedSorting; // project made in eclipse

import java.util.ArrayList; // imported ArrayList class
import java.util.Collections;// imported Collections class
import java.util.Comparator; // imported Comparator class

public class SortEvenFirst implements Comparator { // public class 'SortEvenFirst' that implements
	// from interface comparator
	public int compare(Object obj1, Object obj2) {//a public int compare method made
		//it as class object created for 'obj1, obj2'
		
		Integer a = (Integer)obj1;// a variable set as Integer, it's assigned to obj1 as 'Integer'
		Integer b = (Integer)obj2;// b variable set as Integer, it's assigned to obj2 as 'Integer'
		
		boolean aIsEven = (a%2) ==0; // boolean type created to see if the number is even
		boolean bIsEven = (b%2) ==0;// boolean type created to see if the number is even
		// 'a' variable calls onto the boolean 'IsEven' keyword  to see if the numbers are even or odd
		
		if(aIsEven == bIsEven) { // if aIsEven equals to bIsEven
			if(a<b) return -1; // if 'a' is less than 'b' return -1, value of 'a' should come first in sorting
			if(a>b) return 1;// if 'a' is more than 'b' return 1, value of 'b' should come first in sorting
			return 0; // return '0' if the value of 'a' is the same as 'b'
		}else {
			if(aIsEven) {// if statement made 'aIsEven'
				return 1; // returns 1 to tell its even
			}else {
				return -1; // else -1 to tell its odd
			}
		}
	}

	public static void main(String[] args) {
		
	// object of imported class made 'myNumber', ArrayList imported class set as Integer<Integer>
		ArrayList<Integer> myNumber = new ArrayList<Integer>();
		
	// object calls onto 'add' method to add numbers into the object
		myNumber.add(33);
		myNumber.add(15);
		myNumber.add(20);
		myNumber.add(34);
		myNumber.add(8);
		myNumber.add(12);
		
	//an object of the comparator imported class names 'myComparator' was created calling back using 
	// 'new' keyword to 'SortEvenFirst' class 
		Comparator myComparator = new SortEvenFirst();
		Collections.sort(myNumber,myComparator); // collections class was used calling onto the 
		//'.sort' method in the brackets, its sorts out the numbers with the comparator 
		// sorts out odd and even numbers
		
		for(int i:myNumber) { // the numbers in the object 'myNumber' is pass through to integer
			// variable 'i'
			System.out.println(i); // display the numbers in variable 'i'
		}

	}

}

//Result:
//8
//12
//20
//34
//15
//33