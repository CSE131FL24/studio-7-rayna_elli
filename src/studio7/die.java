package studio7;

public class die {
	private int n;
	public die (int number){
		n = number;
	}
	public int thrown() {
		return (int)(Math.random()*n)+1;
	}
	public static void main(String[] args) {
		die A = new die(10);
		System.out.println(A.thrown());
	}

}
