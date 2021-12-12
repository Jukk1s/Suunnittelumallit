package invoker;

public class TestScreen {

	public static void main(String[] args) {
		
		Screen screen = new Screen();
		Command screenUp = new LiftCommand(screen);
		Command screenDown = new DropCommand(screen);
		WallButton button1 = new WallButton(screenUp);
		WallButton button2 = new WallButton(screenDown);
		
		button1.push();
		button2.push();
		
	}
}
