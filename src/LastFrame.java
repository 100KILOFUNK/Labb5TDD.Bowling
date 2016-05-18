
public class LastFrame extends Frame {
	
	private int extraThrow;
	
	public LastFrame()
	{
		this.extraThrow = 0;
		
	}
	
	public LastFrame(int xtra, int f, int s)
	{
		super(f, s);
		this.extraThrow = xtra;
	}
	
	public void setExtraThow(int extraThrow)
	{
		this.extraThrow = extraThrow;
		
	}
	
	public int getExtraThrow()
	{
		return this.extraThrow;
	}
	
	public int getLastSum(){
		return this.returnSum() + extraThrow;
		
	}
	
	public String toStringSpecifik()
	{
		return "[" + this.getFirst() + ", " + this.getSecond() + ", " + this.extraThrow + "]"; 
	}
}
