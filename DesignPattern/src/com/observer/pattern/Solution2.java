package com.observer.pattern;

import java.io.IOException;

class Result {

	/*
	 * Complete the 'lotteryCoupons' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER n as parameter.
	 */

	public static int lotteryCoupons(int n) {
		
		int[] lottery = new int[12];
		int randomNum;

		for (int i = 0; i < 12; i++) {
			randomNum = (int) (Math.random() * 50); // Random number created
													// here.
			for (int x = 0; x < i; x++) {
				if (lottery[x] == randomNum) // Here, code checks if same random
												// number generated before.
				{
					randomNum = (int) (Math.random() * 50);// If random number
															// is same, another
															// number generated.
					x = -1; // restart the loop
				}

			}
			lottery[i] = randomNum;
		}

		for (int i = 0; i < lottery.length; i++) {
			System.out.print(lottery[i] + " ");
		}
		return lottery.length;
	}

}

public class Solution2 {
	public static void main(String[] args) throws IOException {
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = 3;//Integer.parseInt(bufferedReader.readLine().trim());

		int result = Result.lotteryCoupons(n);
System.out.println(result);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
	}
}
