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
			Player p = new Player(i+1);
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
			checkWinner();
		}
    	
    	try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	
    }
    
    public void checkWinner() {
    	int a = playerList.get(0).getResult();
    	int b = playerList.get(1).getResult();
    	
    	if (a == 0) {
    		if (b == 2) {
    			winner = playerList.get(0).getPlayerNum(); // = pelaaja 1
    			finished = true;
    		} else if (b == 1) {
    			winner =  playerList.get(1).getPlayerNum(); // = pelaaja 2
    			finished = true;
    		} else
    			System.out.println("Tasapeli");	
    		
    	} else if (a == 1) {
    		if (b == 0) {
    			winner =  playerList.get(0).getPlayerNum(); // = pelaaja 1
    			finished = true;
    		} else if (b == 2) {
    			winner =  playerList.get(1).getPlayerNum(); // = pelaaja 2
    			finished = true;
    		} else
    			System.out.println("Tasapeli");	
    		
    	} else if (a == 2) {
    		if (b == 1) {
    			winner =  playerList.get(0).getPlayerNum(); // = pelaaja 1
    			finished = true;
    		} else if (b == 0) {
    			winner =  playerList.get(1).getPlayerNum(); // = pelaaja 2
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
    	System.out.println("--- Pelaaja " + winner + " voitti pelin ---");
    }

}
