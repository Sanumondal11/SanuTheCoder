package codex;

public class q4 {

	public static void main(String[] args) {
		long n=600851475143L;

		for(int c=2;c<=Math.sqrt(n);c++)

		{

		if(n%c==0)

		{

		n=n/c;

		c--;

		}

		}

		if(n>=2)

		System.out.println("Largest Prime Factor :"+n);
	}
	}


