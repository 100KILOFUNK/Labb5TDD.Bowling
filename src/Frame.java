


public class Frame {

	private int first;
	private int second;

	
	public Frame(){
		this.first = 0;
		this.second = 0;
	}
	
	public Frame(int first, int second){
		this.first = first;
		this.second = second;
	}
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int returnSum(){
		return first + second;
	}
	
	public String toString(){
		return "[" + this.first + ", " + this.second + "]"; 
	}
	
	
	
}
