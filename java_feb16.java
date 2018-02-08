import java.util.*;


public class SparseArray {
	
	private int m,n,k;
	
	public SparseArray(int m,int n,int nonZeros) {
		this.m=m;
		this.n=n;
		k= nonZeros;
	}
	
	int[][] array;
	int[] aces;
	int[] nonZeroArray;
	
	public SparseArray(int y) {
		
		int[] aces = new int[y];
		Arrays.fill(aces, 1);

	}
	
	public void SparseArray(int m,int n,int k) {
		int[][] array = new int[m][n];
		nonZeroArray = new int[k];
		int i=0;
		int randomX;
		int randomY;
		
		while(i < k) {
			randomX= (int)Math.random()*m;
			randomY= (int)Math.random()*n;
			
			if(array[randomX][randomY] == 0)
			{
				array[randomX][randomY]= (int)Math.ceil(Math.random()*150);
				nonZeroArray[i]=array[randomX][randomY];
				i++;
			}
		}
	}
	
	public double mean() {
		int sum=0;
		double mean;
		
		for(int i=0; i<nonZeroArray.length; i++)
		{
			sum += nonZeroArray[i];
		}
		
		mean = sum / (m*n);
		
		return mean;
	}
	

	public static void main(String[] args) {
		int[] aces;
		SparseArray(10,10,5);
		

	}

}
