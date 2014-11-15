package lieux;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Trajet {
    private String nom;
    private Lieu depart;
    private Lieu arrivee;
    private Heure dateDepart;
    private ArrayList<Etape> sesEtapes;

    public Trajet(String n, Lieu dep, Lieu arr, Heure d,
		  ArrayList<Etape> etapes) {
	nom = n;
	depart = dep;
	arrivee = arr;
	dateDepart = d;
	sesEtapes = etapes;
    }

    public String nom() { return nom; }

    public Lieu depart() { return depart; }

    public Lieu arrivee() { return arrivee; }

    public void liste() {
	System.out.println("Trajet " + nom + " de " + depart.nom() + " a " 
			   + arrivee.nom() + ", depart a " + dateDepart + " :");
	for(Etape e: sesEtapes) e.liste();
    }

    public boolean estCoherent() {
    	// On test si départ = arrivée
    	if(depart.equals(arrivee) || arrivee.equals(depart)){
    		return false;
    	}
    	int i;
    	for (i=0; i<sesEtapes.size(); i++){
    		// On regarde si arrivee(i) = depart (i+1)
    		if(!(sesEtapes.get(i).arrivee().equals(sesEtapes.get(i+1).depart()))){
    			return false;
    		}
    		if(sesEtapes.get(i).depart().equals(sesEtapes.get(i).arrivee())){
    			return false;
    		}
    		if(sesEtapes.get(i).hDepart().compareTo(sesEtapes.get(i).hArrivee()) > 0){
    			return false;
    		}
    		
    	}
    	
    	// Vérifier si toutes les etapes sont possibles
    	for(Etape e : sesEtapes){
    		if(!(e.estPossible())){
    			return false;
    		}
    	}
    	
	return true;
    }

    public Heure hArrivee() throws ErreurTrajet, ErreurHeure {
    	// Cas ou il y a des etapes
    	if(sesEtapes.size()>0){
    		return sesEtapes.get(sesEtapes.size()-1).hArrivee();
    	}
    	// Cas ou il n'y a pas d'etape
    	Heure hAtt = dateDepart.add(attente());
    	return hAtt.add(duree());	// hArrivee = hdep + attente + duree  			
    }

    // c quoi la duree? attente + duree totale?
    public Heure duree() throws ErreurTrajet {
	return null;
    }

    // c quoi l'attente? l'attente totale de tous les trajets?
    public Heure attente() throws ErreurTrajet, ErreurHeure {
    	//gont
    	int i;
    	Heure hatt=new Heure();
    	for(i=0;i<sesEtapes.size();i++){
    		hatt.add(sesEtapes.get(i).attente());
    	}
    	return hatt;
    }

    // le nb d'étape?
    public int nbChgt() throws ErreurTrajet {
    	return sesEtapes.size();
    }


    public static Trajet meilleur(Collection<Trajet> col, Comparateur comp)
    throws ErreurTrajet {
	return null;
    }

}
