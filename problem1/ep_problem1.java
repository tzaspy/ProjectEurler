

public class ep_problem1 {
	public static void main(String[] args){

		long sum = 0;

		int max3 = 999 / 3;
		int max5 = 999 / 5;
		int max15 = 999 / 15;

		for (int i = 1; i <= max15 ;  i++) {
			// 5 + 3 - 15 = -7
			sum += -7 * i;
		}

		for (int i = max15 +1; i <= max5 ;  i++) {
			// 5 + 3
			sum += 8 * i;
		}

		for (int i = max5 + 1; i <= max3 ;  i++) {
			// 3
			sum += 3 * i;
		}

		System.out.println("Sum = " + sum);
	}

}
