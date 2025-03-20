package observer.weatherStation;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings({ "serial", "deprecation" })
public class Display implements Observer {
  private float temperature;
  private float humidity;
  private float pressure;
  public Display(Meteo meteo){
    meteo.addObserver(this);
  }
  public void display(){
    System.out.println("Actual State: temp: "+ this.temperature +
                          ", hum:" + this.humidity + " & pre: " +this.pressure);
  }
  @Override
  public void update(Observable arg0, Object arg1) {
    if(arg0 instanceof Meteo)
    {
      if(arg1 instanceof float[])
      {
          float[] floatArray = (float[])arg1;
          this.temperature = floatArray[0];
          this.humidity = floatArray[1];
          this.pressure = floatArray[2];
          display();
      }
    }
  }
}
