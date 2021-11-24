package proxy;


class RealImage implements Image {
	private final String filename;
	private String name;

	public RealImage(String filename, String name) {
		this.filename = filename;
		this.name = name;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
	
	public void showData() {
		System.out.println(name);
	}
}

