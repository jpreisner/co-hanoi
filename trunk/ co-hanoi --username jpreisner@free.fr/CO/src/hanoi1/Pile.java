package hanoi1;

public class Pile {
	/* definit une pile d'Object de capacité fixee a l'instantiation */
	protected int capacite;
	protected Object[] tab;

	/**
	 * On pourrait mettre en parametre la classe qu'il faut initialiser pour tab
	 * @param capa
	 */
    public Pile(int capacite) {
    	this.capacite = capacite;
    	tab = new Object[capacite];
    }

    public void empiler(Object v) throws ErreurPile {
    	// si la pile est pleine -> on refuse l'empilement
    	if(hauteur() == capacite){
 		    throw new ErreurPile("Le nb d'élément dans la pile est a son maximum (capa=" + capacite + ")");
 	   	}
    	else{
    		tab[hauteur()] = v;
    	}
    }

    /* supprime l'element en sommet de pile. Leve ErreurPile si la pile est vide */
    public void depiler () throws ErreurPile {
    	// si la pile est vide -> on refuse le dépilement
    	if(hauteur() == 0){
 		    throw new ErreurPile("(depiler) Pas d'element dans la pile");
 	   	}
    	else{
    		tab[hauteur()-1] = null;
    	}
    }

   /* sommet : renvoie l'element en sommet de pile * sans * le depiler
    * Leve ErreurPile si la pile est vide
    */
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

    /* renvoie le nombre actuel d'elements dans la pile */
    public int hauteur(){
    	int i = 0;
    	while (i<capacite && tab[i] != null){
    		i++;
    	}
    	return i;
    }

    /* renvoie la capacite de la pile */
    public int capacite () {
    	return capacite;
    }

    public void affiche () { 
	/* Affiche les elements de la pile (un par ligne) dans l'ordre en commencant par 
	 * l'element en sommet de pile.
	 */
    	int i;
    	for(i=hauteur()-1; i>=0; i--){
    		System.out.println("Object n°" + i + " = " + tab[i]);
    	}
    }
}
