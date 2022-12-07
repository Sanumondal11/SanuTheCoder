package codex;

public class p1 {

	public static void main(String[] args) {
		int b=0;
		for (int a=1;a<1000;a++)
		{
			if((a%3==0)||(a%5==0))
			{
				b=b+a;
			}
		}
		System.out.print(b);
		

	}

}
