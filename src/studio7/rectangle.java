package studio7;

public class rectangle {
	//paramters
	private double width;
	private double length;
	//constructors
	public rectangle(double w, double l) {
		width = w;
		length = l;
	}
	public double Perimeter() {
		double perimeter = 2*(width+length);
		return perimeter;
	}
	public double Area() {
		double area = width*length;
		return area;
	}
	public String Compare(rectangle Y) {
		if (Y.Area() > Area()) {
			return "yes";
		}
		else if (Y.Area()== Area()) {
			return "equal"; 
		}
		else {
			return "no";
		}
	}
	public boolean isSquare() {
		if (width==length) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		rectangle X = new rectangle(6,10);
		rectangle Y = new rectangle(5,10);
		// call the methods
		System.out.println(X.Perimeter());
		System.out.println(X.Area());
		System.out.println(X.Compare(Y));
		System.out.println(X.isSquare());

	}

}
