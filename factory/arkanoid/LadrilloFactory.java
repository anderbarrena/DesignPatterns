package factory.arkanoid;

public class LadrilloFactory {
    private static LadrilloFactory mLadrilloFactory;
    private LadrilloFactory (){} 
    
    public static LadrilloFactory getLadrilloFactory(){
	if (mLadrilloFactory == null)
	    {mLadrilloFactory = new LadrilloFactory();}
	return mLadrilloFactory;
    }
    
    public Ladrillo createLadrillo (int tipo){
	Ladrillo miLadrillo = null;
	if (tipo == 1) { miLadrillo = new Ladrillo1();}
	if (tipo == 2) { miLadrillo = new Ladrillo2();}
	if (tipo == 3) { miLadrillo = new Ladrillo3();}
	return miLadrillo;
    }
}



