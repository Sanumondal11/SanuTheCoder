package codex;

public class q8 {

	public static void main(String[] args) {
		//10001st prime number
		int b=100;
		int c1=0,n=0,m=0,k=0;
		while(m<10001)
		{
			for(int a=1;a<=b;a++)
			{
				for(int c=1;c<=a;c++)
				{
					if(a%c==0)
					{
						c1++;
					}
					
				}
				b++;
				if(c1==2)
				{
					n++;
				}
				m=n;
				c1=0;
				if(n==10001)
				{
					System.out.print(a);
					k=1;
					break;
				}
			}
			if(k==1)
			{
				break;
			}
	
		}
		

	}

}
