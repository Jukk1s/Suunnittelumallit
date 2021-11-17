package templatemethod;

import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors extends Game {
	private int playerCount;
	private ArrayList<Player> playerList;
	private String[] strings = {"kivi", "paperi", "sakset"};
	private boolean finished = false;
	private int winner;
	
	private Random r;
	
	public void initializeGame() {
		playerCount = 2;
		r = new Random();
		playerList = new ArrayList<Player>();
		
		for (int i = 0 ; i < playerCount ; i++) {
			Player p = new Player(i);
			playerList.add(p);
		}
	}

    public void makePlay(int player) {
    	
    	int rand = r.nextInt(3);
    	
    	
    	switch (rand) {
    	case 0: // rock
    		playerList.get(player).setResult(0);
    		System.out.println("Pelaaja " + (player+1) + ": " + strings[rand]);
    		break;  		
    	case 1: // paper
    		playerList.get(player).setResult(1);
    		System.out.println("Pelaaja " + (player+1) + ": " + strings[rand]);
    		break;
    	case 2: // scissors
    		playerList.get(player).setResult(2);
    		System.out.println("Pelaaja " + (player+1) + ": " + strings[rand]);
    		break;
    	}
    	
		//Jos viimeinen (eli toinen) pelaaja kierroksella
		if (player == playerCount - 1) {
			checkWinner(playerList.get(0).getResult(), rand);
		}
    	
    	try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	
    }
    
    public void checkWinner(int i, int j) {
    	if (i == 0) {
    		if (j == 2) {
    			winner = 1; // = pelaaja 1
    			finished = true;
    		} else if (j == 1) {
    			winner = 2; // = pelaaja 2
    			finished = true;
    		} else
    			System.out.println("Tasapeli");	
    		
    	} else if (i == 1) {
    		if (j == 0) {
    			winner = 1; // = pelaaja 1
    			finished = true;
    		} else if (j == 2) {
    			winner = 2; // = pelaaja 2
    			finished = true;
    		} else
    			System.out.println("Tasapeli");	
    		
    	} else if (i == 2) {
    		if (j == 1) {
    			winner = 1; // = pelaaja 1
    			finished = true;
    		} else if (j == 0) {
    			winner = 2; // = pelaaja 2
    			finished = true;
    		} else
    			System.out.println("Tasapeli");	 		
    	}
    }

    public boolean endOfGame() {
    	return finished;
    }

    public void printWinner() {
		finished = true;
    	System.out.println("Pelaaja " + winner + " voitti pelin");
    }

}
