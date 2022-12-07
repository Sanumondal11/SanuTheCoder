package codex;

public class q6 {

	public static void main(String[] args) {
		int c=0,a=1,k=0;
		while(c!=20)
		{
			c=0;
			for(int b=1;b<=20;b++)
			{
				if(a%b==0)
				{
					c++;
				}
				if(c==20) {
					k=1;
					System.out.print(a);
					break;
					
				}
				
			}
			a++;
			if(k==1) {
				break;
			}
		}

	}

}
