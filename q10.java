package codex;

public class q10 {

	public static void main(String[] args) {
		int a=1001,k=0;
		for(int b=1;b<a;b++)
		{
			for(int c=1;c<a;c++)
			{
					for(int d=1;d<=a;d++)
					{
						if(((b*b)+(c*c)==(d*d))&&((b+c+d)==1000))
						{
							System.out.println(b*c*d);
							k=1;
							break;
						}
					}
			}
		if(k==1)
		{
			break;
		}
		}
		

	}

}
