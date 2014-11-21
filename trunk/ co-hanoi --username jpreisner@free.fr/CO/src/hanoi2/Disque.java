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
