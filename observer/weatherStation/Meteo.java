package observer.weatherStation;

import java.util.Observable;
@SuppressWarnings({ "serial", "deprecation" })
public class Meteo extends Observable {
  private float temperature;
  private float humidity;
  private float pressure;
  public Meteo(){}
  public void setInfo(float pTemp, float pHum, float pPre)
  {
    this.temperature = pTemp;
    this.humidity = pHum;
    this.pressure = pPre;
    setChanged();
    notifyObservers(new float[] {temperature, humidity, pressure});
  }
}
