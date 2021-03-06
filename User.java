package control;
import java.util.Scanner;

public class User {
	
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		
		Course  course[] = new Course[2];
		course[0] = new Course("COCS1111", "SEF", "Week1", "Week12");
		course[1] = new Course("COCS2222", "IT", "Week1", "Week12");
		
		Payrate payRate[] = new Payrate[2];
		payRate[0] = new Payrate(4500);
		payRate[1] = new Payrate(3800);
		
		Timetable timetable[] = new Timetable[2];
		timetable[0] = new Timetable("1:30pm","3:30pm","Wednesday");
		timetable[1] = new Timetable("3:30pm","5:30pm","Monday");
		
		Semester semester[] = new Semester[2];
		semester[0] = new Semester("2018","BP162");
		semester[1] = new Semester("2018","BP438");	

		Detail staff[] = new Detail[4];
		staff[0] = new Detail("Edgar","s3598097",5);
		staff[1] = new Detail("Victor","s1234567",1);
		staff[2] = new Detail("Jeff","s3571902",2);
		staff[3] = new Detail("Sil","s3661514",3);
		
		Report report[] = new Report[10];
		
		System.out.println("Now test start!");
		System.out.println("1.select timetable.");
		System.out.println("2.view course.");
		System.out.println("3.upload staff.");
		System.out.println("4.view payrate. and confirm");
		System.out.println("5.view and change payrate");
		
		int n = scan.nextInt();
		
			
		//select timetable
		
		if(n == 1)
		{
			System.out.println("Please choose your class time.");		
			for(int i = 0;i < timetable.length;i++)
			{
				System.out.print(i + 1 + ". ");
				timetable[i].showAvaliableTime();
			}
			int t = scan.nextInt();
			timetable[t - 1].selectTime();
		}
		
		//view course
		if(n == 2)
		{
			for(int i = 0;i < course.length;i++)
			{
				System.out.print(i + 1 + ". ");
				course[i].viewCourse();
			}
		}
		
		//upload staff
		if(n == 3)
		{
			System.out.println("please choose the staff");
			for(int i = 0;i < staff.length;i++)
			{
				System.out.print(i + 1 + ". ");
				staff[i].showStaff();	
			}
			int s = scan.nextInt();
			staff[s - 1].uploadStaff();		
		}
		
		//view payrate
		if(n == 4)
		{
			System.out.println("please choose the payrate of course");
			for(int i = 0;i < course.length;i++)
			{
				System.out.print(i + 1 + ". ");
				course[i].viewCourse();
			}
			int p = scan.nextInt();
			System.out.print(course[p - 1].getcCourseName());
			payRate[p - 1].viewPayRate();
			payRate[p - 1].confirmPayrate();
			
		}
		
		// change payrate		
		if(n == 5)
		{
			System.out.println("please choose the payrate of course");
			for(int i = 0;i < course.length;i++)
			{
				System.out.print(i + 1 + ". ");
				course[i].viewCourse();
			}
			int p = scan.nextInt();
			System.out.print(course[p - 1].getcCourseName());
			payRate[p - 1].viewPayRate();
			payRate[p - 1].designPayrate();
			
		}
			

		
		
	}
	
	
	
	

	

}
