import java.util.Scanner;

public class StarPyramid3
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int Line = s.nextInt();
	for(int LineNumber=1; LineNumber<=Line; LineNumber++)
		{
			for(int Spacebar=Line; Spacebar>LineNumber; Spacebar--)
			{
				System.out.print(" ");
			}
			for(int Star=1; Star<=LineNumber; Star++)
			{
				System.out.print("*");
			}
			for(int StarPlus=1; StarPlus<LineNumber; StarPlus++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}