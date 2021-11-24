package proxy;

class ProxyImage implements Image {
	private final String filename;
	private String name;
	private RealImage image;

	public ProxyImage(String filename, String name) {
		this.filename = filename;
		this.name = name;
	}

	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename, name);
		}
		image.displayImage();
	}
	
	public void showData() {
		System.out.println(name);
	}
}