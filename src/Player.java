import java.util.ArrayList;

public class Player {

	private String name;
	private Frame[] scoreboard;
	private ArrayList<String> frames;
	private int nrOfFrames;
	
	
	public Player(){
		this.name = "Unset";
		this.scoreboard = new Frame[10];
		this.nrOfFrames = 0;
		this.frames = new ArrayList<String>();
	}
	
	public Player(String name){
		this.name = name;
		this.scoreboard = new Frame[10];
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
		
		for(int i = 0; i < nrOfFrames; i++)
			sum += scoreboard[i].returnSum();
		
		return sum;
	}
	
	public void addFrame(int f, int s){
		this.scoreboard[this.nrOfFrames] = new Frame(f, s);
		this.frames.add(this.scoreboard[this.nrOfFrames].toString());
		this.nrOfFrames++;
		
	}
	
	public ArrayList<String> getFrames(){
		return frames;
	}
	
	
	
}
