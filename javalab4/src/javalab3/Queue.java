package javalab3;

public class Queue {
	
	int[] qArray;
	int front,rear;
	int size;
	int nItems;
	
	Queue() {
		qArray=null;
		front=0;
		rear=0;
		size=0;
		nItems=0;
	}

	Queue(int n) {
		qArray=new int[n];		// How to check that the pointers work fine
		front=0;				// 
		rear=-1;				// We want the rear to have the value of 0 after the first command execution
		size=0;					// So as the front and rear pointer both have the value 0 at the beginning
		nItems=0;
	}
	
	boolean isEmpty(){
		return (nItems == 0);
	}
	
	boolean isFull(){
		return (nItems == size);
	}
	
	int size(){
		return nItems;
	}
	
	int peek(){
		
		if(isEmpty())
		{
			System.out.println("The Array is fuckin empty");
			return -1;
		}
		
		else{
			
			return qArray[front];
			
		}
	}
		
	void print() {
		
		for(int i=front; i<=rear; i++)
		{
			System.out.print(qArray[i] + " ");
		}
		
		System.out.println();
		
	}
		
	int remove() {
		if(isEmpty())
		{
			System.out.println("Empty Queue" + " ");
			return -1;
		}
		else{
			nItems--;
			front++;
			return qArray[front-1];
		}
	}
	
	void insert(int x){
		if(isFull())
		{
			System.out.println("The Array is full" + "");
		}else if(rear == size - 1)
			{
			System.out.println("The Array is at the end" + "");
			
			for(int i=0; i<nItems; i++)
			{
				qArray[i]=qArray[front+i];
			}
			front=0;
			rear=nItems-1;
			}
			rear++;
			qArray[rear]=x;
			nItems++;
		}
	
	
	public static void main(String[] args) {
		
		Queue myQueue = new Queue(5); 			// the queue has 5 items

	    myQueue.insert(10);
	    myQueue.insert(20);
	    myQueue.insert(30);
	    myQueue.insert(40);
	    myQueue.insert(45);
	    myQueue.insert(50);

	    myQueue.remove(); 
	    myQueue.remove(); 
	    myQueue.remove();

	    myQueue.insert(50); 
	    myQueue.insert(60); 
	    myQueue.insert(70);
	    myQueue.insert(80);

	    while (!myQueue.isEmpty()) {
	      long n = myQueue.remove(); 
	      System.out.print(n);
	      System.out.print(" ");
	    }
	    System.out.println("");
		

	}

}
