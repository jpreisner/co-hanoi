package lieux;

public class APieds extends MoyenTransport {

    // Pas vraiment utile. On pourrait en faire un singleton.
    public APieds() { }

    public String toString() { return "A Pieds"; }

    public boolean estPossible(Lieu l1, Lieu l2, Heure dep) {
	return false;
    }

    // Y'a pas d'attente
    public Heure attente(Lieu l1, Lieu l2, Heure dep) throws ErreurTrajet {
    	return new Heure();	// retourne 0min
    }

    // duree du voyage de l1 a l2, hors temps d'attente, a l'heure dep selon
    // ce moyen de transport
    public Heure duree(Lieu l1, Lieu l2, Heure dep) throws ErreurTrajet {
    	return l2.distance(l1);	// renvoie une heure
    }


}
