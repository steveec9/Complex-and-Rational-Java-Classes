
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
import java.util.Scanner;

public class TestC
{
	public static void main(String[] args) {
		
		Complex x = new Complex(2,-3); //first complex number, 2 is real, -3 is imaginary
		Complex y = new Complex(4,2); //second complex number, 4 is real, 2 is imaginary

		System.out.println("\n***First Test\n");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		System.out.println("\nDyanmic Functions:\n");
		System.out.println("x + y = " + x.add(y));
		System.out.println("x - y = " + x.sub(y));
		System.out.println("x / y = "+ x.div(y));
		System.out.println("x * y = " + x.mult(y));
		System.out.println("\nPolar Form:\n");
		System.out.println("x -> radius = " + x.mod() + " angle = " + x.ang());
		System.out.println("y -> radius = " + y.mod() + " angle = " + y.ang());

		System.out.println("\nStatic Functions:\n");
		System.out.println("x + y = " + add(x,y));
		System.out.println("x - y = " + sub(x,y));
		System.out.println("x / y = "+ div(x,y));
		System.out.println("x * y = " + mult(x,y));

		System.out.println("\n***Second Test\n");
		x = new Complex(-1,-3); //first complex number, 2 is real, -3 is imaginary
		y = new Complex(-1,-3); //second complex number, 4 is real, 2 is imaginary

		System.out.println("\nDyanmic Functions:\n");
		System.out.println("x + y = " + x.add(y));
		System.out.println("x - y = " + x.sub(y));
		System.out.println("x / y = "+ x.div(y));
		System.out.println("x * y = " + x.mult(y));

		System.out.println("\nPolar Form:\n");
		System.out.println("x -> radius = " + x.mod() + " angle = " + x.ang());
		System.out.println("y -> radius = " + y.mod() + " angle = " + y.ang());

		System.out.println("\nStatic Functions:\n");
		System.out.println("x + y = " + add(x,y));
		System.out.println("x - y = " + sub(x,y));
		System.out.println("x / y = "+ div(x,y));
		System.out.println("x * y = " + mult(x,y));

	}

	public static Complex add(Complex a, Complex b)
	{
		return new Complex(a.real()+b.real(), a.imag()+b.imag());
	}

	public static Complex sub(Complex a, Complex b)
	{
		return new Complex(a.real()-b.real(), a.imag()-b.imag());
	}

	public static Complex mult(Complex a, Complex b)
	{
		return new Complex((a.real()*b.real()-a.imag()*b.imag()), a.real()*b.imag()+a.imag()*b.real());
	}

	public static Complex div(Complex a, Complex b)
	{
		double scale = 0;

		if (b.real()!=0 || b.imag()!=0) {
            scale = Math.sqrt(b.real()*b.real()+b.imag()*b.imag()); //distance formula
            System.out.println(scale);
        } 
        else {
            scale = 0.0D;
        }
		double den = Math.pow(scale, 2);
    	return new Complex((a.real()*b.real() + a.imag()*b.imag()) / den, (a.imag()*b.real() - a.real()*b.imag())/den);
	}

}