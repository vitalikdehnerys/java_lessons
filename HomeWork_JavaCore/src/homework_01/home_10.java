package homework_01;
public class home_10 {

	public static void main(String[] args) {
		int [] arrayNumber= {1,4,6,7,8,13,3,6,16,5,9};
		int min=arrayNumber[0];
		int max=arrayNumber[0];
		for (int i=1;i<arrayNumber.length;i++) {
			if (arrayNumber[i]<min)
			{
				min=arrayNumber[i];
			}
			else if (arrayNumber[i]>max)
			{
				max=arrayNumber[i];
			}	
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
