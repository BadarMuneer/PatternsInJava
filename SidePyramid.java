import java.util.*;
public class SidePyramid
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of lines: ");
		int number=input.nextInt();
		for(int i=number; i>0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}