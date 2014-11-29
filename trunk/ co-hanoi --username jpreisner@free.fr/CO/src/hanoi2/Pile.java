package hanoi2;

public class Pile {
	protected int capacite;
	protected Object[] tab;
	protected int hauteur;
	
    public Pile(int capa) {
    	capacite = capa;
    	tab = new Object[capacite];
    	hauteur = 0;
    }

    public void empiler(Object v) throws ErreurPile {
    	// si la pile est pleine -> on refuse l'empilement
    	if(hauteur == capacite){
 		    throw new ErreurPile("La pile est pleine (capa=" + capacite + ")");
 	   	}
    	else{
    		tab[hauteur] = v;
    		hauteur++;
    	}
    }

    public void depiler () throws ErreurPile {
    	// si la pile est vide -> on refuse le dépilement
    	if(hauteur == 0){
 		    throw new ErreurPile("(depiler) La pile est vide");
 	   	}
    	else{
    		hauteur--;
    		tab[hauteur] = null;
    	}
    }

    public Object sommet() throws ErreurPile {
    	if(hauteur == 0){
    		throw new ErreurPile("(sommet) La pile est vide");
    	}
	   else{
		   return tab[hauteur-1];
	   }
    }

    public boolean estVide() {
    	return hauteur == 0;
    }

    public int hauteur () {
    	return hauteur;
    }

    public int capacite () {
    	return capacite;
    }

    public void affiche () { 
    	int i;
    	for(i=hauteur-1; i>=0; i--){
    		System.out.println("Object n°" + i + " = " + tab[i]);
    	}
    }
}
