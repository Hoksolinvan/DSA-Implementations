
/*
 * Author: Hoksolinvan Chhun
 * Due Date: Feb 12,2023
 * This program sortqueues
 */


//Time Complexity O(N)



package hw3;

import java.util.*;

public class Josephus {
  public ArrayList<Integer> getJosephus(int N, int M){
	  
	  
	  boolean flag=false;
	  int counter=0;
	  int container=0;
	  
	  
	  //Primary Queue
	  
	  QueueX myQ = new QueueX(N);
	  
	  //Secondary Queue
	  ArrayList<Integer> killorder = new ArrayList<>();
	  
	 //adding the value
	  for(int i=0;i<N;i++) {
		  myQ.enqueue(i);
	  }
	  
	  myQ.display();
	  
	  
	  
	  while(myQ.size()!=0) {
		  
		  
		  
		  counter++;
		  flag=false;
		  
		  if(counter==M) {
			  killorder.add(myQ.dequeue());
			  counter=0;
			  flag=true;
		  }
		  
		  else if(myQ.size()==1) {
			  killorder.add(myQ.dequeue());
			  break;
		  }
		  
		  
		  else if(flag==false) {
		 
			  container=myQ.dequeue();
			  myQ.enqueue(container);
			  
		  }

	  }
	  
	
	
	 
	  
	  
	  return killorder; 
  }
  
  public static void main(String[] args) {
    Josephus josephus = new Josephus();
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number for N indicating the total number of people: ");
    int N = input.nextInt();
    System.out.print("Please enter a number for M indicating the Mth person to be eliminated: ");
    int M = input.nextInt();
    input.close();
    
    System.out.println("People will be deliminated in the following order: ");
    System.out.println(josephus.getJosephus(N, M));
  }
}



//class QueueX {
//	private int MAX = 10000;
//	private int maxSize;
//	private int[] queArray;
//	private int front;
//	private int rear;
//	private int nItems;
//
//	// --------------------------------------------------------------
//	public QueueX() // constructor
//	{
//		maxSize = MAX;
//		queArray = new int[maxSize];
//		front = 0;
//		rear = -1;
//		nItems = 0;
//	}
//
//	public QueueX(int size) {
//		maxSize = size;
//		queArray = new int[maxSize];
//		front = 0;
//		rear = -1;
//		nItems = 0;
//	}
//
//	// --------------------------------------------------------------
//	public void enqueue(int j) // put item at rear of queue
//	{
//		if (isFull())  // a fixed capacity Queue.
//			throw new IllegalStateException("Queue is full"); 
//		
//		if (rear == maxSize - 1) // deal with wraparound
//			rear = -1;
//		queArray[++rear] = j; // increment rear and enqueue
//		nItems++; // one more item
//	}
//
//	// --------------------------------------------------------------
//	public int dequeue() // take item from front of queue
//	{
//		if (isEmpty())
//			throw new IllegalStateException("Queue is empty");
//		
//		int temp = queArray[front++]; // get value and incr front
//		if (front == maxSize) // deal with wraparound
//			front = 0;
//		nItems--; // one less item
//		return temp;
//	}
//
//	// --------------------------------------------------------------
//	public int peekFront() // peek at front of queue
//	{
//		return queArray[front];
//	}
//
//	// --------------------------------------------------------------
//	public boolean isEmpty() // true if queue is empty
//	{
//		return (nItems == 0);
//	}
//
//	// --------------------------------------------------------------
//	public boolean isFull() // true if queue is full
//	{
//		return (nItems == maxSize);
//	}
//
//	// --------------------------------------------------------------
//	public int size() // number of items in queue
//	{
//		return nItems;
//	}
//
//	public void display() {	
//		if (front<=rear) {
//			for (int i = front; i <=rear; i++) {
//				System.out.print(queArray[i] + " ");
//			}
//			System.out.println();
//		} else {
//			for (int i = front; i < maxSize; i++) {
//				System.out.print(queArray[i] + " ");
//			}
//			for (int i=0; i<=rear; i++){
//				System.out.print(queArray[i] + " ");
//			}
//			System.out.println();
//		}
//	}
//	
//	
//
//	@Override
//	public String toString() {
//		String s = "";
//		if (front<=rear) {
//			for (int i = front; i <=rear; i++) {
//				s+=queArray[i]+" ";
//			}
//		} else {
//			for (int i = front; i < maxSize; i++) {
//				s+=queArray[i]+" ";
//			}
//			for (int i=0; i<=rear; i++){
//				s+=queArray[i]+" ";
//			}
//		}
//		return s.trim();
//	}
//}
