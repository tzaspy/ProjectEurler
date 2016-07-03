

public class ep_problem1 {
	public static void main(String[] args){

		long sum = 0;

		int p = 1;
		while (p * 3 < 1000){
			sum += (p++ * 3);
		}
		System.out.println("Multiples of  3: p = " + p + ", sum = " + sum);

		p = 1;
		while (p * 5 < 1000) {
			sum += (p++ * 5);
		}
		System.out.println("Multiples of  5: p = " + p + ", sum = " + sum);

		p = 1;
		while (p * 15 < 1000) {
			sum -= (p++ * 15);
		}
		System.out.println("Multiples of 15: p = " + p + ", sum = " + sum);

		System.out.println("Sum = " + sum);
	}
}
