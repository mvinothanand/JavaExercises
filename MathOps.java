//MathOps.java - Trying different operators and random number generator

import java.util.*;

public class MathOps{
	
	//shorthand to print a string and integer
	//Test comment
	
	static void printInt(String s, int i){
		
		System.out.println(s + " = " + i);
	}
	
	//shorthand to print a string and float
	static void printFloat(String s, float f){
		
		System.out.println(s + " = " + i);
	}
	
	public static void main(String [], args){
		
		//create a random number generator
		// seeds with current time by default
		
		Random rand = new Random ();
		
		int i, j, k;
		
		//choose value from 0 to 99
		j = rand.nextInt(100);
		k = rand.nextInt(100);
		
		printInt("j", j);
		printInt("k", k);
		
		
	}
}
