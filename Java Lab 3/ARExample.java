import java.util.ArrayList;

public class ARExample {
	
ArrayList<Float> a;
ArrayList<Float> b;

public ARExample(){
a = new ArrayList<Float>();
}

public ARExample(int n)
{
	b=  new ArrayList<Float> (n);
	a = new ArrayList<Float> (n);
}

float vProd()
{
	float prod=0;
	
	if(b.size() == a.size())
	{
		for(int i=0; i<a.size(); i++)
		{
			 prod = prod + (a.get(i)*b.get(i));
		}
		return  prod;
	}
	else
	{
		return  Float.NEGATIVE_INFINITY;
	}
}

boolean vOrtho(){
	
	return (vProd() == 0);
	
}

void Fill(int n){
	for (int i=0; i<n; i++)
	{
		a.add((float)(Math.random()*100));
		b.add((float)(Math.random()*100));
	}	
}

static void statistics(ArrayList<Float> al){
	float max= al.get(0);
	float min= al.get(0);
	float mean= al.get(0);
	for (int i=1; i<al.size(); i++)
	{
		if(al.get(i)>max)
		{
			max= al.get(i);
		}
		if(al.get(i)<min)
		{
			min= al.get(i);
		}
	}
	for(int i=0; i<al.size(); i++){
		mean=mean+al.get(i);
	}
	mean = mean/al.size();


	System.out.println("Max = " + max);
	System.out.println("Min = " + min);
	System.out.println("Mean Value = " + mean);
	

}

public static void main(String[] args){

ARExample arE= new ARExample(100);
arE.Fill(100);
System.out.println("vProd= " + arE.vProd());
System.out.println("vProd= " + arE.vOrtho());

ARExample.statistics(arE.a);
ARExample.statistics(arE.b);



}
}
