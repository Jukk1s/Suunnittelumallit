package invoker;

public class LiftCommand implements Command {
	private Screen screen;
	
	public LiftCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.liftScreen();
	}
}
