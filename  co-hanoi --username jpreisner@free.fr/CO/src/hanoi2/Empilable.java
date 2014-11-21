package hanoi2;

// Pour l'instant on reste toujours avec la version non generique de Comparable

interface Empilable extends Comparable {
	
	// Fixe la taille d'un element
	public void init(int nb);
	
	// Compare 2 elements
	public int compareTo(Object v);
	
}
