package codex;
import java.math.BigInteger;
public class q11 {
	private static final int DIGITS = 1000;
	
	public String run() {
		BigInteger lowerThres = BigInteger.TEN.pow(DIGITS - 1);
		BigInteger upperThres = BigInteger.TEN.pow(DIGITS);
		BigInteger prev = BigInteger.ONE;
		BigInteger cur = BigInteger.ZERO;
		for (int i = 0; ; i++) {
			
			if (cur.compareTo(upperThres) >= 0)
				throw new RuntimeException("Not found");
			else if (cur.compareTo(lowerThres) >= 0)
				return Integer.toString(i);
			
	
			BigInteger temp = cur.add(prev);
			prev = cur;
			cur = temp;
		}
	}

	
	public static void main(String[] args) {
		 q11 solution = new q11();
			System.out.println(solution.run());
	}

}
