package factorymethod;

public class OpettajaViikonloppuna extends AterioivaOtus {
	
	public Juoma createJuoma() {
		return new Olut();
	}

}
