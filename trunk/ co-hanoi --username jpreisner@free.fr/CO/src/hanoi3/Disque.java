package hanoi3;

public class Disque implements Empilable<Disque> {
    protected int val;

    public Disque() {
    }

    public void init(int v) {
	val = v;
    }

    public String toString() {
	return "Disque[" + val + "]";
    }
    
    @Override
    public int compareTo(Disque d){
    	System.out.println("compareTo de Disque");
		if(val < d.getVal()){
			return -1;
		}
		else if(val == d.getVal()){
			return 0;
		}
		return 1;
    }
    
    public int getVal() {
		return val;
	}

}
