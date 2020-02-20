package homework_01;
public class home_1_2_3 {

	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=-5;
		c=6;
		double d,x1,x2;
		d=b*b-4*a*c;
	
			if (d<0) 
		{
			System.out.println("the equation has no solutions");
		}	
		else 
		{
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
				if (x1==x2)
			{
				System.out.print("Solution  x=");
				System.out.println(x1);
			}
			else
			{
				System.out.println("Solutions:");
				System.out.print("x1=");
				System.out.println(x1);
				System.out.print("x2=");
				System.out.println(x2);
			}
		}
	}
}