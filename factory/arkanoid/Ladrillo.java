public abstract class Ladrillo{
    int dureza = 0;
    protected Ladrillo (){}
    public void rebota(){
	int d = getDureza()- 1;
	if (d==0){
	    destruido();
	}
    }
    public void destruido (){
	System.out.println("destruido");
    }  
    public abstract int getDureza();
}


