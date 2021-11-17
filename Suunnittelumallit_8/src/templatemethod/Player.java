package templatemethod;

public class Player {
	private int playerNum;
	private int result;
	
	public Player(int n) {
		this.playerNum = n;
	}
	
	public void setResult(int r) {
		this.result = r; // 0 = rock , 1 = paper, 2 = scissors
	}

	public int getResult() {
		return result;
	}

	public int getPlayerNum() {
		return playerNum;
	}
	
}
