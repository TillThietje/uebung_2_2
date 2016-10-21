package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		
		double a = 8;
		double b = 3;
		double x = 2;
		
		double aa = a*a;
		double bb = b*b;
		double abx = x*a*b;
		double ab = a+b; 
		double abab = ab*ab;
		
		
		double loesung1 = aa + abx + bb;
		double loesung2 = abab;
		
		System.out.println(loesung1);
		System.out.println(loesung2);

	}

}
