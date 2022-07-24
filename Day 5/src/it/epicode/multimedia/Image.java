package it.epicode.multimedia;

public class Image extends Multimedia implements Brightness {

	// attributi specifici classe Audio
	private int brightness;

	// constructor
	public Image(String title, int brightness) {
		super(title);
		this.brightness = brightness;
	}

	// ======= Getters / Setters =======

	public int getBrightness() {
		return brightness;
	} 

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	// ======= Metodi =======

	@Override
	public void brightnessUp() {
		printImage();
	}

	@Override
	public void brightnessDown() {
		printImage();

	}

	public void printImage() {
		String lvlBrightness = "";
		for (int i = 0; i < brightness; i++) {
			lvlBrightness += "*";
		}
		System.out.println("Immagine corrente: " + lvlBrightness);
	}

}
