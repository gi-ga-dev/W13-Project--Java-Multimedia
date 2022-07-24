package it.epicode.multimedia;

import java.util.Scanner;

public class PlayerMenu {

	// menu relativo alla scelta degli elementi da creare in console
	private Multimedia[] arrMultimedia = new Multimedia[5];
	private int selection;
	private int file;

	public PlayerMenu() {
	}

	// ====== Getters/ Setters ========

	public Multimedia[] getArrMultimedia() {
		return arrMultimedia;
	}

	public void setArrMultimedia(Object[] arrMultimedia) {
		this.arrMultimedia = (Multimedia[]) arrMultimedia;
	}

	// =========== Metodi ============

	public void menuSelection() {
		System.out.println("Seleziona file da creare.. Digita 1 per Audio, 2 per Immagine, 3 per Video");
		Scanner scanSelection = new Scanner(System.in);
		int selection = scanSelection.nextInt();

		switch (selection) {
			case 1:
				createAudio();
				break;
			case 2:
				createImage();
				break;
			case 3:
				createVideo();
				break;
			default:
				System.out.println("Funzione non disponibile, ritorno al menu di selezione..");
				menuSelection();
		}
	}

	public void createAudio() {

		System.out.println("Hai selezionato Audio, inserisci il titolo");
		Scanner audioTitle = new Scanner(System.in);
		String title = audioTitle.nextLine();

		System.out.println("Inserisci il volume:");
		Scanner audioVolume = new Scanner(System.in);
		int volume = audioVolume.nextInt();

		System.out.println("Inserisci la durata:");
		Scanner audioDuration = new Scanner(System.in);
		int duration = audioDuration.nextInt();

		Audio objAudio = new Audio(title, duration, volume);
		// attribuisco oggetto spec. nell'array in base alla selezione
		arrMultimedia[selection] = objAudio;

		System.out.println("Titolo: " + objAudio.getTitle());
		System.out.println("Durata: " + objAudio.getDuration());
		System.out.println("Volume: " + objAudio.getVolume());
		System.out.println("=================================================================");

		selection++;

		if (selection == 5)
			fileSelection();
		else
			menuSelection();
	}

	public void createImage() {

		System.out.println("Hai selezionato Immagine, inserisci il titolo");
		Scanner imgTitle = new Scanner(System.in);
		String title = imgTitle.nextLine();

		System.out.println("Inserisci la luminosita:");
		Scanner imgBrightness = new Scanner(System.in);
		int brightness = imgBrightness.nextInt();

		Image objImage = new Image(title, brightness);
		// attribuisco oggetto spec. nell'array in base alla selezione
		arrMultimedia[selection] = objImage;

		System.out.println("Titolo: " + objImage.getTitle());
		System.out.println("Luminosita: " + objImage.getBrightness());
		System.out.println("=================================================================");

		selection++;

		if (selection == 5)
			fileSelection();
		else
			menuSelection();
	}

	public void createVideo() {

		System.out.println("Hai selezionato Video, inserisci il titolo: ");
		Scanner videoTitle = new Scanner(System.in);
		String title = videoTitle.nextLine();

		System.out.println("Inserisci la luminosita:");
		Scanner videoBrightness = new Scanner(System.in);
		int brightness = videoBrightness.nextInt();

		System.out.println("Inserisci la durata:");
		Scanner videoDuration = new Scanner(System.in);
		int duration = videoDuration.nextInt();

		System.out.println("Inserisci il volume:");
		Scanner videoVolume = new Scanner(System.in);
		int volume = videoVolume.nextInt();

		Video objVideo = new Video(title, duration, volume, brightness);
		// attribuisco oggetto spec. nell'array in base alla selezione
		arrMultimedia[selection] = objVideo;

		// System.out.println("Titolo: " + arrMultimedia[selection].title);
		System.out.println("Titolo: " + objVideo.getTitle());
		System.out.println("Luminosita: " + objVideo.getBrightness());
		System.out.println("Durata: " + objVideo.getDuration());
		System.out.println("Volume: " + objVideo.getVolume());
		System.out.println("=================================================================");

		selection++;

		if (selection == 5)
			fileSelection();
		else
			menuSelection();

	}

	public void fileSelection() {
		System.out.println("Hai creato 5 file con questi titoli: ");
		finalPrint();
		System.out.println("Selezionane 1 per avviarlo..");

		Scanner scanFile = new Scanner(System.in);
		int file = scanFile.nextInt();

		switch (file) {
			case 1:
				System.out.println("Hai selezionato il File n.1 --> " + arrMultimedia[0].getTitle());
				break;

			case 2:
				System.out.println("Hai selezionato il File n.2 --> " + arrMultimedia[1].getTitle());
				break;

			case 3:
				System.out.println("Hai selezionato il File n.3 --> " + arrMultimedia[2].getTitle());
				break;

			case 4:
				System.out.println("Hai selezionato il File n.4 --> " + arrMultimedia[3].getTitle());
				break;

			case 5:
				System.out.println("Hai selezionato il File n.5 --> " + arrMultimedia[4].getTitle());
				break;

			default:
				fileSelection();
		}

	}

	public void finalPrint() {
		for (Multimedia ele : arrMultimedia) {
			System.out.println("Titolo: " + ele.getTitle());
		}
	}

}
