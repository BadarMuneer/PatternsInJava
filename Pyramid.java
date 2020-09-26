import java.util.*;
public class Pyramid
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of Lines: ");
		int number=input.nextInt();
		for(int i=1; i<=number; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}