package templatemethod;

abstract class Game {
	 
    protected int playerCount;

    abstract void initializeGame();

    abstract void makePlay(int player);

    abstract boolean endOfGame();

    abstract void printWinner();

    /* A template method : */
    public final void playOneGame(int playerCount) {
        this.playerCount = playerCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()){
            makePlay(j);
            j = (j + 1) % playerCount;
        }
        printWinner();
    }
}
