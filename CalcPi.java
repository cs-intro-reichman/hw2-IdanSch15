// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
		double down = 1.0;
		double sum = 0;
		int add = 2;

		while (times > 0) {
			sum += 1.0/down;
			down = -1 * (down + add);
			add *= - 1;
			times --;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}

}
