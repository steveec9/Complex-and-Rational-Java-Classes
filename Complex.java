/*
*
* Version info
*
* Copyright notice
*
* Course : CSC171 SPRING 2014
*
* Assignment : Project 1
*
* Author : Stephen Cool
*
* Lab Session : TR 2:00 - 3:15
*
* Lab TA : David Sekora and Yaron Shaverdi
*
* Last Revised : March 27, 2014
*
*/
public class Complex
{
	private double x, y;
	//contructor
	public Complex(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	//accessor to real part
	public double real()
	{
		return x;
	}
	//accessor to imaginary part
	public double imag()
	{
		return y;
	}
	//add
	public Complex add(Complex a)
	{
		return new Complex(x+a.real(), y+a.imag());
	}
	//subtract
	public Complex sub(Complex a)
	{
		return new Complex(x-a.real(), y-a.imag());
	}
	//multiply
	public Complex mult(Complex a)
	{
		return new Complex((x*a.real()-y*a.imag()), x*a.imag()+y*a.real());
	}
	//distance from origin to x,y
	public double mod() 
	{
        if (x!=0 || y!=0) {
            return Math.sqrt(x*x+y*y); //distance formular
        } else {
            return 0.0D;
        }
    }
    //atan2() converts x,y to polar form then returns angle
    public double ang()
    {
       	return Math.atan(y/x);
    }
    //divide
    public Complex div(Complex a)
    {
    	double den = Math.pow(a.mod(), 2);
    	return new Complex((x*a.real() + y*a.imag()) / den, (y*a.real() - x*a.imag())/den);
    }
    //toString
	public String toString()
	{
		if (x!=0 && y>0) {
            return x+" + "+y+"i";
        }
        if (x!=0 && y<0) {
            return x+" - "+(-y)+"i";
        }
        if (y==0) {
            return x + "";
        }
        if (x==0) {
            return y+"i";
        }
        // shouldn't get here (unless Inf or NaN)
        return x+" + i*"+y;
	}
}