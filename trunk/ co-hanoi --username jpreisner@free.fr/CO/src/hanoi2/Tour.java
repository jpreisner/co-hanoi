package hanoi2;

public class Tour extends Pile {
    
    public Tour(int capa) {
    	super(capa);
    }
    
    public void empiler(Object v) throws ErreurPile {
    	Empilable e = (Empilable) v;
    	try{
	    	if(estVide() || e.compareTo((Empilable)sommet())<0){
	    			super.empiler(e);
	    	}
	    	else{
	    		throw new ErreurTour("Probleme avec l'objet empilable qu'on veut empiler");
	    	}
    	}catch(ClassCastException ex){
    		throw new ErreurTour("L'objet v n'est pas empilable");
    	}
    }
}
