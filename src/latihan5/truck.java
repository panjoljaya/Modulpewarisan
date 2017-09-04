package latihan5;

public class truck{
	
	public int cadence;
	public int gear;
	public int speed;
	
	public truck (int startcadence, int startspeed, int startgear)
	{
		gear = startgear;
		cadence = startcadence;
		speed = startspeed;
	}
	
	public void setcadence(int newValue)
	{
		cadence = newValue;
	}
	
	public void setgear(int newValue)
	{
		gear = newValue;
	}
	
	public void applybreak (int decrement)
	{
		speed = decrement;
	}
	
	public void speedup(int increment)
	{
		speed = increment;
	}
}