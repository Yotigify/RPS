package game;

public class RockPaperScissors {

	private int wins = 0;
	private int loses = 0;
	private int draws = 0;
	private boolean keepPlaying = true;
	private char handsign;
		
	public RockPaperScissors() {
		keepPlaying = true;
	}
	
	public RockPaperScissors(char sign) {
		this.handsign = sign;
	}

	public int getWins() {
		return wins;
	}

	public int getLoses() {
		return loses;
	}

	public int getDraws() {
		return draws;
	}

	public char getHandsign() {
		return handsign;
	}

	public void setRock() {
		this.handsign = 'R';
	}
	
	public void setPaper() {
		this.handsign = 'P';
	}
	
	public void setScizzors() {
		this.handsign = 'S';
	}
	
	public boolean getKeepPlaying() {
		return keepPlaying;
	}
	
	public void setKeepPlaying(boolean cont) {
		this.keepPlaying = cont;
	}
	public int playGame(RockPaperScissors opphand) {
		if(this.getHandsign() == opphand.getHandsign()) {
			draws++;
			return 0;
		}
		else if(((handsign == 'R') && (opphand.getHandsign() == 'S')) 
				|| ((handsign == 'P') && opphand.getHandsign() == 'R')
				|| ((handsign == 'S') && opphand.getHandsign() == 'P')) {
			wins++;			
			return 1;
		}
		else {
			loses++;
			return -1;
		}
	}
	
	
	
	

}

