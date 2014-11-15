package lieux;

public class EnBus extends MoyenTransport {
    private LigneBus saLigne;

    public EnBus(LigneBus l) { saLigne = l; }

    public String toString() {
	return "Ligne Bus [" + saLigne.nom() + "]";
    }
    
    public Heure attente(Lieu l1, Lieu l2, Heure dep) throws ErreurTrajet {
    	Arret a1 = (Arret) l1;
    	//Arret a2 = (Arret) l2;
    	return saLigne.attente(a1, dep);
    }

    // durée sans l'attente
    public Heure duree(Lieu l1, Lieu l2, Heure dep) throws ErreurTrajet {
    	Arret a1 = (Arret) l1;
    	Arret a2 = (Arret) l2;
    	return saLigne.dureeEnBus(a1, a2);
    	/*
    	if(saLigne.sesArrets.contains(a1) && saLigne.sesArrets.contains(a2)){
    		
    	}
    	return null;	// bizarre
    	*/
    }

    public boolean estPossible(Lieu l1, Lieu l2, Heure dep) {
    	Arret a1 = (Arret) l1;
    	Arret a2 = (Arret) l2;
    	
    	/**
    	 * Regarder les horaires
    	 */
    	
    	if(saLigne.sesArrets.contains(a1) && saLigne.sesArrets.contains(a2)){
    		return true;
    	}
    	return false;
    }
}
