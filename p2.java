package codex;

public class p2 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=0;
		int c,d=0;
		do {
			c=a+b;
			a=b;
			b=c;
			n++;
			if(c%2==0)
			{
				d=d+c;
			}
		}
		while(n<4000001);
		System.out.println();
		System.out.print("the sum is:"+d);
		

	}

}
