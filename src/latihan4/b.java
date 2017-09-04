package latihan4;

class b extends a{
	private int b;
	public void setb(int nilai)
	{
		b = nilai;
	}
	
	public int getb()
	{
		return b;
	}
	
	public void tampilkan(){
	super.tampilkan();
        System.out.println("Nilai b : " +getb());
	}
}