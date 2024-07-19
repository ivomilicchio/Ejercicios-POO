package ar.edu.info.unlp.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	private List<Media> media;
	
	public MediaPlayer() {
		
		media = new ArrayList<Media>();
	}
	
	public void addMedia(Media newMedia) {
		
		if (newMedia != null) {
			media.add(newMedia);
		}
	}
	
	public void play() {
		
		media.forEach(m -> m.play());
	}

}
