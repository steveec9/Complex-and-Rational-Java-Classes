public class Test
{
	public static void main(String[] args) {
		
		Rational x = new Rational(-1,5);
		Rational y = new Rational(4,-8);

		Rational a = new Rational(3,1);
		Rational b = new Rational(1,-5);


		//Using dynamic methods with objects
		Rational div = x.div(y);
		Rational mult = x.mult(y);
		Rational add = x.add(y);
		Rational sub = x.sub(y); 
		boolean ans = x.equals(y);
		int comp = x.compareTo(y);

		//Using static methods
		Rational div_stat = div(a,b);
		Rational mult_stat = mult(a,b);
		Rational add_stat = add(a,b);
		Rational sub_stat = sub(a,b);

		//Dynamic Funx
		System.out.println("Dyanmic Functions:\n");
		System.out.println("x = "+ x);
		System.out.println("y = " + y);
		System.out.println("x == y ? " + ans);
		System.out.println("x compared to y = " + comp);
		System.out.println("x + y = "+ add);
		System.out.println("x - y = " + sub);
		System.out.println("x / y = " +div);
		System.out.println("x * y = "+ mult+"\n");
		//Static Funx
		System.out.println("a = "+ a);
		System.out.println("b = " + b);
		System.out.println("Static Functions: \n");
		System.out.println("a + b = "+ add_stat);
		System.out.println("a - b = " + sub_stat);
		System.out.println("a / b = " +div_stat);
		System.out.println("a * b = "+ mult_stat+"\n");
	
	}

	public static Rational add(Rational a, Rational b)
	{
		int numerator = (a.numerator()*b.denominator()) + (a.denominator()*b.numerator());
		int denominator = (a.denominator()*b.denominator());
		return new Rational(numerator, denominator);
	}

	public static Rational sub(Rational a, Rational b)
	{
		int numerator = (a.numerator()*b.denominator()) - (a.denominator()*b.numerator());
		int denominator = (a.denominator()*b.denominator());
		return new Rational(numerator, denominator);
	}

	public static Rational mult(Rational a, Rational b)
	{
		return new Rational(a.numerator()*b.numerator(), a.denominator()*b.denominator());
	}

	public static Rational div(Rational a, Rational b)
	{
		return new Rational(a.numerator()*b.denominator(), a.denominator()*b.numerator());
	}
}