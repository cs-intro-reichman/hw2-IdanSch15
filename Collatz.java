// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int start = 1;
		int seedPrt = seed;

		if (mode.equals("v"))
			while (seed > 0) {
				System.out.print(start + " ");
				int num = start;
				String count = " ";

				while (true) {
					if (num % 2 == 0) {
						num /= 2;
					}
					else if (num % 2 != 0) {
						num = (num * 3) + 1;
					}
					System.out.print(num);
					
					count += " ";

					if (num == 1) {
						System.out.println(" (" + count.length() + ")");

						break;
					}

					System.out.print(" ");
				}

				seed --;
				start ++;
			}
		System.out.println("Every one of the first " + seedPrt + " hailstone sequences reached 1.");

	}
}
