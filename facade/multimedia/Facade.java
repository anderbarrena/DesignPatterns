package facade.multimedia;

public class Facade {

    private static Facade myFacade = new Facade();
    private PC ordenador;
    private Speaker altavoz;
    private DVD dvd;
    private Projector proyector;
    private Screen pantalla;
    
    private Facade() {
		ordenador = new PC();
		altavoz = new Speaker();
		dvd = new DVD();
		proyector = new Projector();
		pantalla = new Screen();
    }
    public static Facade getFacade() {
		return myFacade;
    }
    public void setUpFilm() {
		pantalla.start();
		proyector.start();
		proyector.dvdMode();
		dvd.start();
		altavoz.start();
		altavoz.adjustVolume(15);
		dvd.insertDisck();
		dvd.play();
    }
    public void setUpTalk() {
		pantalla.start();
		proyector.start();
		proyector.pcMode();
		ordenador.start();
		ordenador.sharePresentation();
    }    
}
