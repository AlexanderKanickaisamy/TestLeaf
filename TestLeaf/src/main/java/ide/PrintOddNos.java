package ide;

public class PrintOddNos {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) { // If number is odd
				// if(i % 2 = 0){ //If number is even
				System.out.print(i);
				if (i != 99) {
					System.out.print(", ");//To add comma after every odd nos
				}
			}
		}
		System.out.print("."); // Add period after all numbers are written

	}
}
