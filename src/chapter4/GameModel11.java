package chapter4;

public class GameModel11 {
	private static final GameModel11 instance = new GameModel11();
	private final Deck sD = new Deck();
	public GameModel11(){}
	
	public GameModel11 instance() {
		return this.instance();
	}
	
	public void newGame() {
		sD.shuffle();
	}
}
