import java.util.Scanner;
public class amstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int t=n;
		int s=0;
		while(t!=0)
		{
			int r=t%10;
			s=s+(r*r*r);
			t=t/10;
		}
		if(s==n)
			System.out.println("Amstrong");
		else
			System.out.println("Not Amstrong");
		System.out.println("Testing");
		
	}
		 
}
