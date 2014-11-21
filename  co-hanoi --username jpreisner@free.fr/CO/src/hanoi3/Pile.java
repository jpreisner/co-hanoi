package hanoi3;

import java.util.ArrayList;

import hanoi1.ErreurPile;

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
 		    throw new ErreurPile("Le nb d'élément dans la pile est a son maximum (capa=" + capacite + ")");
 	   	}
    	else{
    		tab.set(hauteur(), v);
    	}
    }

    public void depiler () throws ErreurPile {
    	// si la pile est vide -> on refuse le dépilement
    	if(hauteur() == 0){
 		    throw new ErreurPile("(depiler) Pas d'element dans la pile");
 	   	}
    	else{
    		tab[hauteur()-1] = null;
    	}
    }

    public T sommet() throws ErreurPile {
 	   if(hauteur() == 0){
		    throw new ErreurPile("(sommet) Pas d'element dans la pile");
	   }
	   else{
		   return tab[hauteur()-1];
	   }
    }

    public boolean estVide() {
    	return hauteur() == 0;
    }

    public int hauteur() {
    	int i = 0;
    	while (i<capacite && tab[i] != null){
    		i++;
    	}
    	return i;
    }

    public int capacite () {
    	return capacite;
    }

    public void affiche () { 
    	int i;
    	for(i=0; i<hauteur(); i++){
    		System.out.println("Object n°" + i + " = " + tab[i]);
    	}
    }
}
