public class Rational
{
	private int num;
	private int den;

//constructor
	public Rational(int num, int den)
	{
		if (den == 0)
		{
			throw new RuntimeException("Denominator is zero");
		}

		int g = gcd(num, den);
		this.num=num / g;
		this.den=den / g;
	}
//accessor
	public int numerator()
	{
		return num;
	}
//accessor
	public int denominator()
	{
		return den;
	}
//equals function to see if two rational numbers are equal	
	public boolean equals(Rational b)
	{
		return (this.num == b.num) && (this.den == b.den);
	}

	//recursive Euclid's GCD algoirthm found at: http://introcs.cs.princeton.edu/java/23recursion/Euclid.java.html
	public static int gcd(int p, int q)
	{
		if (q==0) return p;
		else return gcd(q, p%q);
	}
//toString for prints
	public String toString() 
	{
		if (den == 1)
			return num+"";
		if(num ==0)
			return 0+"";
		if(den <0)
		{
			return num*(-1) + "/" + den*(-1);
		}

		else 
			return num + "/" + den;
	}
//multiplications
	public Rational mult (Rational a)
	{
		return new Rational(this.num*a.num, this.den*a.den);
	}
//division
	public Rational div(Rational b)
	{
		return new Rational(this.num*b.den, this.den*b.num);
	}
//addition
	public Rational add(Rational c)
	{
		int numerator = (this.num*c.den) + (this.den*c.num);
		int denominator = (this.den*c.den);
		return new Rational(numerator, denominator);
	}
//subtraction	
	public Rational sub(Rational d)
	{
		int numerator = (this.num*d.den) - (this.den*d.num);
		int denominator = (this.den*d.den);
		return new Rational(numerator, denominator);
	}
//compare two rational numbers, if a<b return -1; if a>b return 1, if a==b return 0
	public int compareTo(Rational b) {
        Rational a = this;
        int lhs = a.num * b.den;
        int rhs = a.den * b.num;
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
    }
}// Reference: http://introcs.cs.princeton.edu/java/32class/Rational.java.html


