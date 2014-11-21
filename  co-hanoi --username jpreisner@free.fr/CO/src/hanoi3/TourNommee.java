package hanoi3;

public class TourNommee<??> extends Tour<??> {

    protected String nom;

    public TourNommee(int nb, String n) {
	super(nb); nom = n;
    }

    public void affiche() {
	System.out.println(nom + ":"); super.affiche();
    }
}
