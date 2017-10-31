
public class Complex extends SimpleComplex {
	
	public Complex()
	{
		super();
	}
	
	public Complex(float a, float b)
	{
		super(a,b);
	}
	
	public Complex conjugate()
	{
		Complex kotsas = new Complex(getReal(), -getImaginary());
		return kotsas;
	}
	
	public static Complex multi(Complex a, Complex b)
	{
		float x= (a.getReal() * b.getReal() - (a.getImaginary() * b.getImaginary())) ;
		float y= (a.getReal() * b.getReal() + (a.getImaginary() * b.getReal() ));
		return new Complex(x,y);
	}	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Complex[] compArray = new Complex[10];
	float[] norms = new float[10];
	
	
	for(int i=0; i< compArray.length; i++)
	{
		compArray[i] = new Complex((float)Math.random() , (float)Math.random());
		norms[i] = compArray[i].computeNorm();
		System.out.print(compArray[i].getReal() + " + i" + compArray[i].getImaginary() + "");
		System.out.print(norms[i] + "");
		System.out.print(compArray[i].conjugate().getReal() + "+i" + compArray[i].conjugate().getImaginary() + "");
		System.out.println(Complex.multi(compArray[i],compArray[i].conjugate()).getReal()) + "+i" + Complex.multi(compArray[i],compArray[i].conjugate().getImaginary());
	}
	
	
	
	
		
	}

}
