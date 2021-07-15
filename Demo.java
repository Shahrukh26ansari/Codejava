package bgn;

public class Demo {
	public static void main(String[] args) {
		int sum = 0;
		int num = 200;
		for (int i = 100; i <= num; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("Sum of number whose divisable by 7 is " + sum);
	}
}