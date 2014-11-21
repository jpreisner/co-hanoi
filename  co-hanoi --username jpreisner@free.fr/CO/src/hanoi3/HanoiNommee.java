package hanoi3;

public class HanoiNommee<??> extends Hanoi<??> {

    public HanoiNommee(ArrayList<??> inits) {
	super(inits);
	int nb = inits.size();
	depart = new TourNommee<??>(nb, "Depart");
	milieu = new TourNommee<??>(nb, "Milieu");
	arrivee = new TourNommee<??>(nb, "Arrivee");
	try {
	    for(?? o: inits) 
		depart.empiler(o);
	} catch (ErreurTour e) {
	    System.out.println(e.getMessage());
	} catch (ErreurPile e) {
	    System.out.println(e.getMessage());
        }
    }

    public void affiche() {
	depart.affiche(); milieu.affiche(); arrivee.affiche();
    }

}
