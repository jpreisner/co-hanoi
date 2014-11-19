package hanoi2;

public class Disque implements Empilable {
	private int val;
	
	public Disque(int val){
		fixerTaille(val);
	}
	
	@Override
	public void fixerTaille(int val) {
		// TODO Auto-generated method stub
		this.val = val;
		
	}

	@Override
	public int compareTo(Object v) {
		// TODO Auto-generated method stub
		if(v == null){
    		throw new NullPointerException("(compareTo) l'objet v est null");
    	}
		else{
			Disque d = (Disque) v;
			return (this.val-d.val);
		}
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}
