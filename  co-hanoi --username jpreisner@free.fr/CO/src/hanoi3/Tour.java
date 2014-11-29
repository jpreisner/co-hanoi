package hanoi3;

// La classe Tour est elle-meme generique et sous-classe de Pile 
public class Tour<T extends Empilable<? super T>> extends Pile<T> {
    
    public Tour(int capa) {
    	super(capa);
    }
    
    public void empiler(T v) throws ErreurPile{
    	if(estVide() || v.compareTo(sommet())<0){
    		super.empiler(v);
    	}
    	else{
    		throw new ErreurTour("Probleme avec l'objet " +v.getClass().getName()+ " qu'on veut empiler");
    	}
    }
}
