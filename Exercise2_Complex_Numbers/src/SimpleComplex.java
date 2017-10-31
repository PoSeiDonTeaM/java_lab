
public class SimpleComplex {
	
	private float real,imaginary ;
	
	public SimpleComplex() 
	{
		real=0;
		imaginary=0;
	}
	
	public SimpleComplex(float real, float imaginary)
	{
		this.real=real;				// this.real means that this.real is from the same class , in order our compiler not to be confused with 2 variables with the same name.
		this.imaginary=imaginary;
	}
	
	public float getReal(){ 		// we use setters and getters, in order to have access to some private classes
		return real;			    
	}
	
	public float getImaginary(){
		return imaginary;
	}
	
	public void setReal(float s)
	{
		real=s;
	}
	
	public void setImaginary(float i)
	{
		imaginary=i;
	}
	
	public float computeNorm()
	{
		return (float) Math.sqrt((real*real)+(imaginary*imaginary));
	}
	
	}

	


