
/*
 * Author: Hoksolinvan Chhun
 * Due Date: Feb 12,2023
 * This program follows the Ramanujan algorithm to solve the availability of two sums equating to one
 */



package hw3;

import java.util.*;

//time complexity O(NLOGN)

public class Ramanujan {
    // A data type that encapsulates a pair of numbers (i, j) 
    // and the sum of their cubes, ie, i^3 + j^3.
    private static class Pair implements Comparable<Pair> {
        private int i;          // first element of the pair
        private int j;          // second element of the pair
        private int sumOfCubes; // i^3 + j^3

        // Construct a pair (i, j).
        Pair(int i, int j) {
            this.i = i;
            this.j = j;
            sumOfCubes = i * i * i + j * j * j;
        }
        
       





		// Compare this pair to the other by sumOfCubes.
        public int compareTo(Pair other) {
            return sumOfCubes - other.sumOfCubes;
        }
    }

    public static void main(String[] args) {
        // YOUR CODES
    
  
    	//Priority Queue of Pairs
    	
    	PriorityQueue<Pair> container= new PriorityQueue<>();
    	
    	
    	int newuserinputsum=0;
    	System.out.println("Enter a number");
    	Scanner console = new Scanner(System.in);
    	int userinput=console.nextInt();
    	console.close();
    	
    	
    	for(int i=1;i<Math.cbrt(userinput);i++) {
    		
    		container.offer(new Pair(i,i+1)); //
    	
    	}
    	
    	
    	Pair previous = new Pair(0,0);

    	while(!container.isEmpty()) {
    		
    		Pair current = container.poll(); //
    		
    		
    		if(previous.sumOfCubes==current.sumOfCubes) {
    			
    			newuserinputsum=(int)(Math.pow(previous.i,3)+Math.pow(previous.j,3));
    			System.out.println(newuserinputsum+"="+previous.i+"^3"+"+"+previous.j+"^3"+"="+current.i+"^3"+"+"+current.j+"^3");
    			
    		}
    		
    		if(current.j<Math.cbrt(userinput)) {
    			container.offer(new Pair(current.i,current.j+1));
    		}
    		
    		previous=current; //
    	}
    	
    	
    }
}
