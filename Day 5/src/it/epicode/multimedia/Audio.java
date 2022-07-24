package it.epicode.multimedia;

public class Audio extends Multimedia implements Volume {

	// attributi specifici classe Audio
	private int duration;
	private int volume;

	public Audio(String title, int duration, int volume) {
		// constructor
		super(title);
		this.duration = duration;
		this.volume = volume;
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

	// ======= Metodi =======

	@Override
	public void volumeUp() {

		this.volume++;
		printAudio();

	}

	@Override
	public void volumeDown() {
		this.volume--;
		printAudio();

	}

	public void printAudio() {
		String lvlAudio = "";
		for (int i = 0; i < volume; i++) {
			lvlAudio += "!";
		}
		System.out.println("Volume corrente: " + lvlAudio);
	}
	
	public void printAudioDur() {
		String audioDuration = "";
		for (int i = 0; i < duration; i++) {
			audioDuration += "--> " + this.title;
		}
		System.out.println("Durata Audio: " + audioDuration);
	}

}
