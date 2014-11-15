package hanoi1;

// On utilise la version "non generique" de Comparable

public class Disque implements Comparable {
    private int val;

    public Disque (int v) {
    	val = v;
    }

    public String toString() {
    	return "Disque[" + val + "]";
    }

    public int compareTo(Object v) {
    	if(v == null){
    		throw new NullPointerException("(compareTo) l'objet v est null");
    	}
    	else{
        	//if(v.getClass().getName().equals("Disque")){
	    		Disque d = (Disque) v;
	    		return this.val - d.getVal();
	    	//}
	    	//else{
	    		//throw new ErreurPile("L'object v n'est pas un Disque");	// ErreurPile???
	    	//}	
    	}
    }
    
    public int getVal(){
    	return val;
    }
    
}
