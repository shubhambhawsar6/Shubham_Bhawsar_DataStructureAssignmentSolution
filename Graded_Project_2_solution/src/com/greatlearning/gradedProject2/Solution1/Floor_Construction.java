package com.greatlearning.gradedProject2.Solution1;

import java.util.Scanner;
import java.util.Stack;

public class Floor_Construction {

	public static void main (String [] args)  {

		Stack<Integer> stack = new Stack<Integer>();
		//Normal day stack
		Stack<Integer> stack_dcd = new Stack<Integer>();
		// Descending order of stack  
		Stack<Integer> stack_print = new Stack<Integer>();
		// printing result of particular day
		Scanner scanner =new Scanner(System.in);

		// Enter days of floor
		System.out.println("enter the total no of floors in the building");
		int size = scanner.nextInt();


		// Enter stack of floor size day by day
		for (int i = 0 ; i<size; i++) {
			System.out.println("enter the floor size given on day "+(i+1));
			stack.add(scanner.nextInt());

		}
		// Descending order of stack directly with integer doesn't need
		// any sorting methods
		for (int i = size ; i>0; i--) {
			stack_dcd.add(i);
		}
		// printing both stacks 
		System.out.println(stack);
		System.out.println("descending order of floor");
		System.out.println(stack_dcd);

		// search stack and equate it with max stack
		// and again search for lower index and equate with max and go on
		int l1 =0;
		for(int i = 0;i<size;i++) {
			System.out.println("Day "+(i+1)+" >");
			for(int j =i;j>=0;j--) {
				if(stack.get(j)==stack_dcd.elementAt(l1)) {

					stack_print.add(stack_dcd.elementAt(l1));
					System.out.print(stack_print);
					l1++;

					stack_print.clear();	
				}

			}	
			System.out.println("");

		}
		scanner.close();
	}

}
