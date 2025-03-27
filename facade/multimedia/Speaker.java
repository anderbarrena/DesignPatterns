package facade.multimedia;

public class Speaker {
    public void start() {
	System.out.println("Speaker on!");
    }
    public void adjustVolume(float pV) {System.out.println("Volume at "+pV+"!");
    }
}
