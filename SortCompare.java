package learnings;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class SortCompare {

	public static void main(String[] args){
		ArrayList<Car> carList = new ArrayList<Car>();
		
		for (int i=0;i<20;i++){
			Car c = new Car("H-"+i);
			c.setPrice((int)(Math.random()*100) + 1);
			carList.add(c);
		}
		
		Iterator<Car> carIterator = carList.iterator();
		
		while(carIterator.hasNext()){
			Car c = carIterator.next();
			System.out.println(c+"  price  "+c.getPrice());
		}
		
		Collections.sort(carList);
		System.out.println("*****************Ater Sorting***********************************");
		
		Iterator<Car> afterSort = carList.iterator();
		
		while(afterSort.hasNext()){
			Car c = afterSort.next();
			System.out.println(c+"  price "+c.getPrice());
		}
		
		System.out.println("***custom Comparator");
		Collections.sort(carList,new CustomComparator());
		
		Iterator<Car> custcomp = carList.iterator();
		
		while(custcomp.hasNext()){
		  Car c = custcomp.next();
		  System.out.println(c+" Price " + c.getPrice());
			
		}
		  
		
	}
}


