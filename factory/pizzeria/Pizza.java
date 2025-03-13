public abstract class Pizza {
    protected Pizza(){} 
    public abstract void preparar();
    public void hornear() {System.out.println("Pizza en el horno.");}
    public void cortar() {System.out.println("Pizza cortada.");}
    public void meterEnCaja() {System.out.println("Pizza en la caja.");}
}
