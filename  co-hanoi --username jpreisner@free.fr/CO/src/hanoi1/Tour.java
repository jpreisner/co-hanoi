package hanoi1;

public class Tour extends Pile {
    
    public Tour(int capa) {
    	super(capa);
    	//tab = new Disque[capa];
    }

    public void remplir(int nb) throws ErreurPile {
		for(; nb > 0; nb--) 
		    this.empiler(new Disque(nb));
    }

    public void empiler(Object v) throws ErreurPile {
    	Disque d = (Disque) v;
    	try{
	    	if(estVide() || d.compareTo((Disque)sommet())<0){
	    		super.empiler(d);
	    	}else{
				throw new ErreurTour("Probleme avec le disque qu'on veut empiler");
	    	}
    	}catch(ClassCastException e){
    		throw new ErreurTour("Probleme : l'objet v n'est pas empilable");
    	}
    }
}
