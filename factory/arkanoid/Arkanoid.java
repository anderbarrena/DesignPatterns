package factory.arkanoid;

import java.util.*;
public class Arkanoid {
    private static  Arkanoid mArkanoid;
    private Block[][] wall = null;
    private Arkanoid() {
    }
    public static Arkanoid getArkanoid(){
	if (mArkanoid == null){mArkanoid = new Arkanoid();}
	return mArkanoid;
    }
    public void generate(int rows, int cols) {
		wall = new Block[rows][cols];
		Random gen = new Random();
		for (int i = 0; i < rows; i++) {
	    	for (int j = 0; j < cols; j++) {
				int type = gen.nextInt(3)+1;
				Block blc = BlockFactory.getBlockFactory().generate(type);
				wall[i][j] = blc;
				System.out.print(blc.getHarness()+" ");
	    	}
	    	System.out.println();
		}
    }
}
