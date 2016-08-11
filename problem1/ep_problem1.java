

public class ep_problem1 {
	public static void main(String[] args) {

		long sum;

		int n3 = 999 / 3;
		int n5 = 999 / 5;
		int n15 = 999 / 15;

		sum = computeS(n3, 3, 3) + 
				computeS(n5, 5, 5) -
				computeS(n15, 15, 15);

		System.out.println("Sum = " + sum);
		System.out.println("Sum = " + computeS(51, 7, 3));
	}


	static long computeS(int n, int a1, int i) {
		return n * (2* a1 + (n -1) * i) / 2;
	}
}
