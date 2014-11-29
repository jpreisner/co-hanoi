package hanoi2;

public class Disque implements Empilable {
	private int val;
	
	public Disque(int val){
		init(val);
	}
	
	@Override
	public void init(int nb) {
		// TODO Auto-generated method stub
		val = nb;
	}

	@Override
	public int compareTo(Object v) {
		// TODO Auto-generated method stub
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

	public int getVal() {
		return val;
	}
}
