package control;

public class Timetable {
	
	private String startTime;
	private String endTime;
	private String date;
	private boolean available;
	
	public Timetable(String startTime,String endTime,String date)
	{
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
		available = true;
	}
	
	public String getStartTime()
	{
		return startTime;
	}
	
	public String getEndTime()
	{
		return endTime;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void selectTime()
	{
		if(available == false)
			System.out.println("unavailable number");
		else 
		{
			available = false;
			System.out.printf("You have booked Start time : %s. End time : %s. Date  :%s .\n",getStartTime(), getEndTime(), getDate());	
			
		}
	}
	
	public  void showAvaliableTime()
	{
		if(available == true)
		{
			System.out.printf("Start time : %s. End time : %s. Date  :%s .\n",getStartTime(), getEndTime(), getDate());			
		}	
	}
	
	
}
