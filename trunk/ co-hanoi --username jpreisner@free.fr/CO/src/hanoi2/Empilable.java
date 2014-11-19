package hanoi2;

// Pour l'instant on reste toujours avec la version non generique de Comparable

interface Empilable extends Comparable {
	
	// Fixe la taille d'un element 
	// Compare 2 elements
	
	public void fixerTaille(int val);
	public int compareTo(Object v);
	
}
