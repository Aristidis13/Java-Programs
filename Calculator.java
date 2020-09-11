import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		int x=1,y=1,z;
		String str,str1;
		Scanner number = new Scanner(System.in);
			System.out.println("Give me the first integer.");
			str=number.nextLine();
			try
			{
				x=Integer.parseInt(str);
			}
			catch(NumberFormatException e)
			{
				if ("".equals(str))
				{
					System.out.println("No number is given.Setting x as 1.");
				}
				else if (str.length()>0)
				{
					System.out.println("You gave a string.Setting x to 1");
				}
			}
			System.out.println("Give me the second integer.");
			str1=number.nextLine();
				try
				{
					y=Integer.parseInt(str1);
				}
				catch(NumberFormatException e)
				{
					if ("".equals(str1))
					{
						System.out.println("No number is given.Setting y as 1.");
					}
					else if (str1.length()>0)
					{
						System.out.println("You gave a string.Setting y to 1");
					}
				}
			number.close();
			try
			{
			z=(x-7)*y/(x-2);
			System.out.println("The result equals to "+z);
			}
			catch (ArithmeticException e){}
			finally
			{
				if ((x==2) && (y>0))
				{
					System.out.println("Result is -00");
				}
				else if ((x==2)&&(y<0))
				{
					System.out.println("Result is +00");
				}
				else if ((x==2) && (y==0))
				{
					System.out.println("Result is undefined");
				}
			}
	}
}
