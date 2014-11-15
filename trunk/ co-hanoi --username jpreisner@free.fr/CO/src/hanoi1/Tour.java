package hanoi1;

public class Tour extends Pile {
    
    public Tour(int capa) {
    	super(capa);
    	super.tab = new Disque[capa];
    }

    public void remplir(int nb) throws ErreurPile {
	for(; nb > 0; nb--) 
	    this.empiler(new Disque(nb));
    }

    public void empiler(Object v) throws ErreurPile {
    	Disque d = (Disque) v;
		super.empiler(d);
    	/*
    	if(v.getClass().getName().equals("Disque")){
    		Disque d = (Disque) v;
    		System.out.println("On empile d = " + d);
    		super.empiler(d);
    	}
    	else{
    		throw new ErreurPile("L'object v n'est pas un Disque");
    	}
    	*/
    }
}
