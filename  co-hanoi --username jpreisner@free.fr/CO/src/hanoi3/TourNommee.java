package hanoi3;

public class TourNommee<T extends Empilable <? super T>> extends Tour<T> {

    protected String nom;

    public TourNommee(int nb, String n) {
    	super(nb); nom = n;
    }

    public void affiche() {
    	System.out.println(nom + ":"); super.affiche();
    }
    
    public void empiler(T v) throws ErreurPile{
    	super.empiler(v);
    	System.out.println("Empilement de l'élément " + v + " sur la tour " + nom + " a la position " + (this.hauteur()-1));
    	affiche();
    }

}
