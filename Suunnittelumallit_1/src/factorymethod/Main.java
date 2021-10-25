package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus opettaja2 = new OpettajaViikonloppuna();
        opettaja2.aterioi();
    }
}
