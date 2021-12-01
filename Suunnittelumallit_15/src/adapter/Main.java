package adapter;

public class Main {

	public static void main(String[] args) {
		IDrum tom = new Tom();
		ICymbal hihat = new HiHat();
		ICymbal drumAdapter = new DrumAdapter();
		
		tom.playDrum();
		hihat.playCymbal();
		drumAdapter.playCymbal();

	}

}
