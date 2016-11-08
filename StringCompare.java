package learnings;

import java.util.*;
import java.io.*;

public class StringCompare {

	/**
	 * @param args
	 * This program will compare two strings
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ANTHONI";
		String str2 = "SUREKHA";
		String str3 = "anthoni";
		
		System.out.println(str1.compareTo(str2)); // -18
		System.out.println(str2.compareTo(str1)); // 18
		System.out.println(str1.compareTo(str3)); // -32
		
		//This is used to identify the last occurance of the Hello word
		
		String str4 = "Hello world, Hello Anthoni";
		int i1 = str4.lastIndexOf("Hello");
		System.out.println(i1);
		
		//How to replace the perticular character in the string
		String str5 = "Hello world, Hello Anthoni";
		System.out.println( str5.replace("H","A"));
		System.out.println( str5.replaceFirst("H","A"));
		System.out.println( str5.replaceAll("H","A"));
		
		String str6 = "abcdef";
		
		
		
		
	}

}
