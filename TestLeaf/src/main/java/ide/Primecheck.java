package ide;

import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {
		int n, i, count = 0;
		Scanner get = new Scanner(System.in);
		n = get.nextInt();
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("This is a Prime Number");

		} else {
			System.out.println("This is not a Prime Number");
		}

	}

}
