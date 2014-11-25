package hanoi3;

interface Empilable<T> extends Comparable<T> {
 
 // Fixe la taille d'un element
 	public void init(int nb);
}

