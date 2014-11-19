package hanoi2;

public class Pile {
	protected int capacite;
	protected Object[] tab;
	
	/**
	 * On pourrait mettre en parametre la classe qu'il faut initialiser pour tab
	 * @param capa
	 */
    public Pile(int capa) {
    	capacite = capa;
    	tab = new Object[capacite];
    }

    public void empiler(Object v) throws ErreurPile {
    	if(hauteur() == capacite){
 		    throw new ErreurPile("Le nb d'élément dans la pile est a son maximum (capa=" + capacite + ")");
 	   	}
    	else{
    		tab[hauteur()] = v;
    	}
    }

    public void depiler () throws ErreurPile {
    	if(hauteur() == 0){
 		    throw new ErreurPile("(depiler) Pas d'element dans la pile");
 	   	}
    	else{
    		tab[hauteur()-1] = null;
    	}
    }

    public Object sommet() throws ErreurPile {
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

    public int hauteur () {
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
