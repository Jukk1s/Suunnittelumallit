package proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyExample {
	
	public static void main(final String[] arguments) {
		List<Image> images = new ArrayList<Image>();
		
		Image image1 = new ProxyImage("../res/longcat.jpg", "long cat");
		Image image4 = new ProxyImage("../res/hungrycat.png", "hungry cat");
		Image image3 = new ProxyImage("../res/angrycat.jpg", "angry cat");	
		Image image2 = new ProxyImage("../res/sleepycat.jpg", "sleepy cat");
		Image image5 = new ProxyImage("../res/happycat.jpg", "happy cat");
		
		images.add(image1);
		images.add(image2);
		images.add(image3);
		images.add(image4);
		images.add(image5);
		
		//Tiedot valokuvakansion sisällöstä
		for (Image img : images) {
			img.showData();
		}
		
		System.out.println("----------");
		
		//Kuvien lataaminen
		for (Image img : images) {
			img.displayImage();
		}
		
		System.out.println("----------");
		
		//Tässä silmukassa kuvia ei enää ladata, vaan ne voidaan suoraan "näyttää"
		for (Image img : images) {
			img.displayImage();
		}
 			
	}
}