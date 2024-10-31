package studio7;

public class fraction {
	private double num;
	private double den;
	public fraction (double numerator, double denominator) {
		num = numerator;
		den = denominator;
	}
	public double fra() {
		return num/den;
	}
	public double add(fraction B){
		double sum = 0;
		if (den==B.den) {
			sum = (num+B.num)/den;
		}
		else {
			sum = (num*B.den+den*B.num)/(den*B.den);
		}
		return sum;
	}
	public double multiply(fraction B){
		double product = (num*B.num)/(den*B.den) ;
		return product;
	}
	public String reciprocal(){
		String result = (int)den+"/"+(int)num;
		return result;
	}
	public double common(double num2, double den2) {
		if (den2 != 0) {
			return common(den2, num2%den2);
		}
		else {
			return num2;
		}
	}
	public String simplify() {
		if (num%den == 0) {
			return num+"/"+den;
		}
		else {
			int num2 = (int)num/(int)(common(num,den));
			int den2 = (int)den/(int)common(num,den);
			
			return num2+"/"+den2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction A = new fraction(2,6);
		fraction B = new fraction(3,4);
		System.out.println(A.simplify());
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
		System.out.println(A.reciprocal());

	}

}
