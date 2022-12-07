package codex;

public class q5 {

	public static void main(String[] args) {
		int c;
		int k=0;
		char e;
		String h="";
		int max=0;
		for(int a=100;a<1000;a++)
		{
			for(int b=100;b<1000;b++)
			{
				c=a*b;
				String d =Integer.toString(c);
				//System.out.println(d);
				int f=d.length();
				//System.out.println(f);
				for(int g=f-1;g>=0;g--)
				{
				e=d.charAt(g);
				h=h+e;
				}
				//System.out.println(h);
				k=Integer.parseInt(h);
				//System.out.print(k);
				if(k==c)
				{
					if(k>max)
					{
						max=k;
					}
				}
				e=' ';
				h="";
				k=0; 
				
			}
			
			
		}System.out.print(max);

	}

}
