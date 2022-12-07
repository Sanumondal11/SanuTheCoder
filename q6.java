package codex;

public class q7 {

	public static void main(String[] args) {
		double b=0.0,d=0.0,e=0.0;
		for(double a=1;a<=100;a++)
		{
			b= b+Math.pow(a,2);
		}
		System.out.println((int)b);
		for(double c=1;c<=100;c++)
		{
			d=d+c;
		}
		e=Math.pow(d,2);
		System.out.println((int)e);
		double x=e-d;
		System.out.print((int)e+"-"+(int)b+"="+(int)x);

	}

}
