import java.util.ArrayList;

public class Player {

	private String name;
	private Frame[] scoreboard;
	private LastFrame lf;
	private ArrayList<String> frames;
	private int nrOfFrames;
	
	
	public Player(){
		this.name = "Ezio Auditore Da Fírenze";
		this.scoreboard = new Frame[10];
		
		for(int i = 0; i < 10; i++)
			scoreboard[i] = new Frame();
		
		this.nrOfFrames = 0;
		this.frames = new ArrayList<String>();
	}
	
	public Player(String name){
		this.name = name;
		this.scoreboard = new Frame[10];
		
		for(int i = 0; i < 10; i++)
			scoreboard[i] = new Frame();
		
		this.nrOfFrames = 0;
		this.frames = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Frame[] getScoreboard() {
		return scoreboard;
	}

	public void setScoreboard(Frame[] scoreboard) {
		this.scoreboard = scoreboard;
	}

	public String returnScore(int i){
		return scoreboard[i].toString();
	}
	
	


	public int getNrOfFrames() {
		return nrOfFrames;
	}

	public void setNrOfFrames(int nrOfFrames) {
		this.nrOfFrames = nrOfFrames;
	}

	public int getSum() { //write a testcase here
		int sum = 0;
	
		for(int i = 0; i < nrOfFrames; i++){
			int framescore = 0;
		
			
			
			if(isStrike(i)){
				
				
				//needs to handle if its the last frame, then it just adds ten
				if(i != nrOfFrames-1)
					framescore += 10 + StrikeBonus(i+1);
				else{
					framescore += calculateLastframe();
					System.out.println(calculateLastframe());
				}
			}else{
				
				framescore = scoreboard[i].returnSum();
				
				if(isSpare(i))
					framescore += SpareBonus(i+1);
				
					
			}
			
			sum += framescore;
			System.out.println("i: " + i + ": SUM: " + sum);
		}
		
		return sum;
	}
	
	
	public Boolean isStrike(int i){
		return scoreboard[i].getFirst() == 10;
	}
	
	public Boolean isSpare(int i){
		return scoreboard[i].getFirst() + scoreboard[i].getSecond() == 10;
	}
	
	public int SpareBonus(int i){
		return scoreboard[i].getFirst();
	}
	
	public int StrikeBonus(int i){
		if(scoreboard[i].getFirst() == 10 && i < 9)
			return scoreboard[i].getFirst()+scoreboard[i+1].getFirst();
		else
			return scoreboard[i].returnSum();
	}
	
	public int calculateLastframe(){
		return ((LastFrame) scoreboard[9]).getLastSum();
	}
	
	public void addFrame(int f, int s){
		this.scoreboard[this.nrOfFrames] = new Frame(f, s);
		this.frames.add(this.scoreboard[this.nrOfFrames].toString());
		this.nrOfFrames++;
		
	}
	
	public void addLastFrame(int f, int s, int x){
		
		this.scoreboard[this.nrOfFrames] = new LastFrame(x, f, s);
		this.frames.add(((LastFrame) this.scoreboard[nrOfFrames]).toStringSpecifik());
		this.nrOfFrames++;
		
	}
	
	public ArrayList<String> getFrames(){
		return frames;
	}
	
	
	
}
