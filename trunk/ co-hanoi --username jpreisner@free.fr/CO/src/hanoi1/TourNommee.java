package hanoi1;

public class TourNommee extends Tour {

    protected String nom;	// correspond a D, M, ou A

    public TourNommee(int nb, String n) {
    	super(nb);
    	nom = n;
    }

    /* trace l'empilement de l'element sur la Tour */
    public void empiler(Object d) throws ErreurPile {
    	super.empiler(d);
    	System.out.println("Empilement de l'élément " + d + " sur la tour " + nom + " a la position " + (this.hauteur()-1));
    	affiche();
    }

    /* trace le depilement de l'element de la Tour */
    public void depiler() throws ErreurPile {
    	System.out.println("Dépilement de l'élément " + this.tab[hauteur()-1] + " sur la tour " + nom + " a la position " + (this.hauteur()-1));
    	super.depiler();
    	affiche();    	
    }

    public void affiche() {
    	System.out.println(nom + ":"); super.affiche();
    }
}
