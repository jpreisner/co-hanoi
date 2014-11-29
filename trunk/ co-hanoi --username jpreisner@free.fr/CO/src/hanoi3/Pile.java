package hanoi3;

import java.util.ArrayList;

// Pile Homogene de <T>, de capacite fixee a l'instantiation

public class Pile<T> { 
	protected int capacite;
	protected ArrayList<T> tab; 

    // suppose 'capa' strictement positif !
    public Pile(int capa) {
    	if(capa<=0){
    		capa = 1;
    	}
    	capacite = capa;
    	tab = new ArrayList<T>();
    }

    public void empiler(T v) throws ErreurPile {
    	// si la pile est pleine -> on refuse l'empilement
    	if(hauteur() == capacite){
 		    throw new ErreurPile("La pile est pleine (capa=" + capacite + ")");
 	   	}
    	else{
    		tab.add(v);
    	}
    }

    public void depiler () throws ErreurPile {
    	// si la pile est vide -> on refuse le dépilement
    	if(hauteur() == 0){
 		    throw new ErreurPile("(depiler) La pile est vide");
 	   	}
    	else{
    		tab.remove(hauteur()-1);
    	}
    }

    public T sommet() throws ErreurPile {
 	   if(hauteur() == 0){
		    throw new ErreurPile("(sommet) La pile est vide");
	   }
	   else{
		   return tab.get(hauteur()-1);
	   }
    }

    public boolean estVide() {
    	return hauteur() == 0;
    }

    public int hauteur() {
    	return tab.size();
    }

    public int capacite () {
    	return capacite;
    }

    public void affiche () { 
    	int i;
    	for(i=hauteur()-1; i>=0; i--){
    		System.out.println("Object n°" + i + " = " + tab.get(i));
    	}
    }
}
