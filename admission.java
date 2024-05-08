
import java.util.Scanner;
class admission
{
	public static void main(String args[])
	{

		int math;
		int physics;
		int hindi;
		int english;
		int chemistry;

		int marks;

		System.out.println("enter the marks of math,physics,hindi,english,chemistry");

		Scanner s1= new Scanner(System.in);

		math=s1.nextInt();

		physics=s1.nextInt();
		
		hindi=s1.nextInt();
		
		english=s1.nextInt();
		
		chemistry=s1.nextInt();
		

	
		marks=math+physics+hindi+english+chemistry;

		if(math>=65 && physics>=55 && chemistry>=50 && marks>=190 && (math+physics)>=140 )
		{
			System.out.println("your are eligible for Admission");

		}

		else
		{
			System.out.println("not eligible");
		}
	
	}
}