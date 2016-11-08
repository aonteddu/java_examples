package learnings;

import java.util.*;

public class CustomComparator implements Comparator<Car> {

	@Override
	public int compare(Car arg0, Car arg1) {
		if ((arg0.getPrice() % 2 == 0) &&
		   (arg1.getPrice() % 2) != 0)
				return -1;
		else if ((arg0.getPrice() % 2 != 0)
			 && ((arg1.getPrice() % 2) == 0))
				return +1;
		else if((arg0.getPrice() % 2 == 0)
			&& ((arg1.getPrice() % 2) == 0))
			return arg0.compareTo(arg1);
		else if((arg0.getPrice() % 2 != 0)
				&& ((arg1.getPrice() % 2) != 0))
			return arg0.compareTo(arg1);
		return 0;
			
		/*else if (arg0.getPrice() / 2 != 0 )
			return -1; */
		
		/*if (((arg0.getPrice() / 2) == 0) &&
		    ((arg1.getPrice() / 2) != 0))
			return +1;
		else if(((arg0.getPrice() / 2) != 0) &&
			    ((arg1.getPrice() / 2) == 0))
			return -1;
		else if(((arg0.getPrice() / 2) != 0) &&
			    ((arg1.getPrice() / 2) != 0))
			return -1; */
		
		
		/*else if(((arg0.getPrice() / 2) != 0) &&
			    ((arg1.getPrice() / 2) != 0))
			return -1;*/
		
	}
	

}
