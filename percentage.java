import java.util.Scanner;

class percentage
{
	public static void main(String args[])
	{
		int math=70;
		int physics=60;
		int hindi=78;
		int english=80;
		int chemistry=67;

		int marks;
		int percentage;

		marks=math+physics+hindi+english+chemistry;
		System.out.println("your obtained marks is="+marks);

		percentage=marks*100/500;
		System.out.println("your percentage is ="+percentage);

		if(percentage<35)
		{
			System.out.println("your fail");
		}

		else if(percentage>=35 && percentage<=50)
		{
			System.out.println("you got a 'D'grade");

		}

		else if (percentage>50 && percentage<=60)
		{
		System.out.println("you got 'C'grade");
		}

		else if (percentage>60 && percentage<=75)
		{
			System.out.println("you got 'B'grade");
		}
		
		else if (percentage>75 && percentage<=85)
		{
			System.out.println("you got 'B+'grade");
		}
		

		else if (percentage>85 && percentage<=95)

		{
			System.out.println("you got 'A'grade");
		}

		else if(percentage>95 && percentage<=100)
		{
			System.out.println("you got 'A+' grade");
		}
		
		else
		{
		 	System.out.println("you are not valid");
		}
		
	}
}