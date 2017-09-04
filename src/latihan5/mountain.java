package latihan5;

public class mountain extends truck{
	public int seatheight;
    private int startheight;
    private String gear;
	public mountain(int startseat, int startcadence, int startspeed, int startgear){
		super(startcadence, startspeed, startgear);
		seatheight = startheight;
	}
	
	public void setheight(int newvalue){
		seatheight = newvalue;
	}
	
	public static void main(String [] args){
		System.out.println("mulai berjalan");
		mountain mb = new mountain(0,0,0,0);
		System.out.println("gear = " + mb.gear);
		System.out.println("speed = " + mb.speed);
		mb.setgear(2);
		mb.speedup(2);
		System.out.println("gear = " + mb.gear);
		System.out.println("speed = " + mb.speed);
		mb.speedup(2);
		System.out.println("gear = " + mb.gear);
		System.out.println("speed = " + mb.speed);
	}

 
}