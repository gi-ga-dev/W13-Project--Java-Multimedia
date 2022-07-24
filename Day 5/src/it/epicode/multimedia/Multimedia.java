package it.epicode.multimedia;

public abstract class Multimedia {
	// attributi in comune con le sottoclassi
	String title;

	public Multimedia(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
