package selfpractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("navacar");
	    cars.add("BMWvolvo");
	    cars.add("Benz");
	    cars.add("Tesla");
	    cars.add("Toyota");
	    Collections.sort(cars);
	    for(String i:cars)
	    {
	    	System.out.println(i);
	    	
	    }
	   /* for(int i=0;i<cars.size();i++)
	    {
	    	System.out.println(cars.get(i));
	    }
	    
	   // System.out.println(cars);

	    /*System.out.println(cars.get(0));
	    System.out.println(cars.remove(0));
	    System.out.println(cars.set(0, "opel"));
	    System.out.println(cars.size());
	    
	    System.out.println(cars);*/
	    
    
    
	}

}
