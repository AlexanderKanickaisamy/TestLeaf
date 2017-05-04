package ide;

public class Fiboseries {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 1;
		System.out.println("Fibonacci Series : ");
		for (int i = 1; i <= 100; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + " ");
		}
	}

}
