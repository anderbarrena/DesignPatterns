package observer.weatherStation;

public class Main {
    public static void main (String[] args){
		Meteo meteo = new Meteo();
		Display d1 = new Display(meteo);
		Display d2 = new Display(meteo);
		Display d3 = new Display(meteo);
		meteo.setInfo(20,80,1000);
    }
}
