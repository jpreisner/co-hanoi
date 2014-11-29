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
    		Disque d = (Disque) v;
    		if(val < d.getVal()){
    			return -1;
    		}
    		else if(val == d.getVal()){
    			return 0;
    		}
    		return 1;
    	}
    }
    
    public int getVal(){
    	return val;
    }   
}