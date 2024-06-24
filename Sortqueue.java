/*
 * Author: Hoksolinvan Chhun
 * Due Date: Feb 12,2023
 * This program Sort queue
 */


//Time Complexity O(N^2)

package hw3;

import java.io.*;
import java.util.*;




public class SortQueue {
	
	
	public static QueueX selectionSortQ(QueueX myQ) {
        
		
		//creates a new queue for output
		
		QueueX secondQ = new QueueX(myQ.size());
		
		
	

		int size=myQ.size();
	
		for(int i=0;i<size-1;i++) {
			
			int count=0;
			int max=myQ.dequeue();
			int size2=myQ.size();
			
			while(count<size) {
				int front=myQ.dequeue();
				if(front<max) {
					myQ.enqueue(max);
					max=front;
				}
				else {
					myQ.enqueue(front);
				}
				count++;
			}
			
			secondQ.enqueue(max);
		
			
		}
		secondQ.enqueue(myQ.dequeue());
		
		

		
		
		return secondQ;
		
	
    }
	
    public static void main(String args[]) {
    	
    	    	
        QueueX myQ= new QueueX(8);
        myQ.enqueue(4);
        myQ.enqueue(1);
        myQ.enqueue(5);
        myQ.enqueue(2);
        myQ.enqueue(1);
        myQ.enqueue(3);
        
      
     
    
        
        myQ.display();
        QueueX sortedQ = selectionSortQ(myQ);
        sortedQ.display();
    }
}




















//QueueX interface
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
//
//
//
