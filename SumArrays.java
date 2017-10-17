

package array;

public class SumArrays {							// All classes , their names start with capital
													// Variables start their names with lower case letters
	public static void main(String[] args) {		// Functions start their names with lower case letters and at the end they have brackets. (e.g. myNewArray() )
		// TODO Auto-generated method stub
		int[] myNewArray = new int[10];				// We need to use "new int" when declaring arrays for the first time
		int[] myNewArray1 = new int[10];			
		int[] myNewArray2 = new int[10];
		
		for(int i=0; i<myNewArray.length; i++)		//Don't forget to declare i
		{											//In order to get the size of the array use the command "Name_of_the_array.length"
			myNewArray1[i] = (int)(Math.random()*20);
			myNewArray[i] = i;
			
			
			myNewArray2[i]= myNewArray[i] + myNewArray[i];
			System.out.println(myNewArray[i]+ "+" + myNewArray1[i] + "=" + myNewArray2[i]);
		}
	}

}
