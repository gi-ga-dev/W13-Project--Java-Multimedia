package it.epicode.multimedia;

public class Video extends Multimedia implements Volume, Brightness {

	// attributi specifici classe Audio
	private int duration;
	private int volume;
	private int brightness;

	// constructor
	public Video(String title, int duration, int volume, int brightness) {
		super(title);
		this.duration = duration;
		this.volume = volume;
		this.brightness = brightness;
	}

	// ======= Getters / Setters =======

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	// ======= Metodi =======

	@Override
	public void brightnessUp() {
		brightness++;
		printImage();
	}

	@Override
	public void brightnessDown() {
		brightness--;
		printImage();
	}

	@Override
	public void volumeUp() {
		volume++;
		printAudio();
	}

	@Override
	public void volumeDown() {
		volume--;
		printAudio();
	}
	
	public void printImage() {
		String lvlBrightness = "";
		for (int i = 0; i < brightness; i++) {
			lvlBrightness += "*";
		}
		System.out.println("Immagine corrente: " + lvlBrightness);
	}
	
	public void printAudio() {
		String lvlAudio = "";
		for (int i = 0; i < volume; i++) {
			lvlAudio += "!";
		}
		System.out.println("Volume corrente: " + lvlAudio);
	}
	
	public void printVideoDur() {
		String videoDuration = "";
		for (int i = 0; i < duration; i++) {
			videoDuration += "--> " + this.title;
		}
		System.out.println("Durata Video: " + videoDuration);
	}

}
