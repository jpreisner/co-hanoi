package hanoi2;

public class Tour extends Pile {
    
    public Tour(int capa) {
    	super(capa);
    	tab = new Empilable[capa];
    }

    /* A mettre? Si oui comment faire new Empilable?
    public void remplir(int nb) throws ErreurPile {
		for(; nb > 0; nb--) 
		    this.empiler(new Empilable(nb));
    }
    */
    
    public void empiler(Object v) throws ErreurPile {
    	Empilable d = (Empilable) v;
    	if(!estVide()){
    		if(d.compareTo((Empilable)sommet())<0){
    			super.empiler(d);
    		}
    		else{
    			throw new ErreurTour("Probleme : L'objet \"empilable\" qu'on veut empiler est plus grand que le sommet");
    		}
    	}
    	else{
    		super.empiler(d);
    	}
    }
}
