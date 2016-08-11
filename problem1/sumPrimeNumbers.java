public class sumPrimeNumbers {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		int sum = 0;

		for (int i = 3; i < 1000; i++){
			if ((i % 3 == 0) || (i % 5 == 0)){
				sum = sum + i;
			}
		}

		System.out.println("Total is: " + sum);

		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime-startTime) + "ms");
	}
}

