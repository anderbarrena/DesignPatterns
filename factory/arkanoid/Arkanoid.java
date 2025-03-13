package factory.arkanoid;

import java.util.*;
public class Arkanoid {
    private static  Arkanoid mArkanoid;
    private Ladrillo[][] pared = null;
    private Arkanoid() {
    }
    public static Arkanoid getArkanoid(){
	if (mArkanoid == null){mArkanoid = new Arkanoid();}
	return mArkanoid;
    }
    public void crearMuro(int filas, int cols) {
	pared = new Ladrillo[filas][cols];
	Random gen = new Random();
	for (int i = 0; i < filas; i++) {
	    for (int j = 0; j < cols; j++) {
		int tipo = gen.nextInt(3)+1;
		Ladrillo ladrillo = LadrilloFactory.getLadrilloFactory().createLadrillo(tipo);
		pared[i][j] = ladrillo;
		System.out.print(ladrillo.getDureza()+" ");
	    }
	    System.out.println();
	}
    }
}
