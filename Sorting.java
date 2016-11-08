package learnings;
import java.util.*;
import java.io.*;

public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		Map map = new TreeMap();
		List<String> linelist = new ArrayList<String>();
		
		try{
			String str;
			String s1 = "D:\\Hadoop_material\\Java_material\\Salary.txt";
			br = new BufferedReader(new FileReader(s1));
			while ((str = br.readLine()) != null) {
				String arr[] = str.split("\t");
				for (int i=0;i<(arr.length-1); i++){
					map.put(arr[i],arr[i+1]);
				}
				
			}
		}
		catch (IOException e) {
			e.printStackTrace();
	  }	
		
		System.out.println(map);
		
		/*List list = new LinkedList(map.entrySet());
		Collections.sort(list);
		public int compare(Object O1,Object O2){*/
			
			
		}
		/*Collections.sort(linelist);
		System.out.println("After Sorting");
		for (String item:linelist){
			System.out.println(item);
		}*/
		
	
	}
	
	
