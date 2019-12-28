package divisible;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a number");
		int number = Integer.parseInt(br.readLine());
		if (number > 0) {
			System.out.println("positve");
		} else if (number < 0) {
			System.out.println("negative");
		} else {
			System.out.println("Zero");

		}
	}

}
