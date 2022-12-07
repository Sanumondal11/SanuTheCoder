package codex;

public class q9 {

	public static void main(String[] args) {
		long a=200000L,d=0L;
		int c1=0;
		for(int b=1;b<a;b++)
		{
			for(int c=1;c<=b;c++)
			{
				if(b%c==0)
				{
					c1++;
					//System.out.println(c);
				}
				
			}
			if(c1==2)
			{
				d=d+b;
			}
			c1=0;
		}
		System.out.print(d);

	}

}
