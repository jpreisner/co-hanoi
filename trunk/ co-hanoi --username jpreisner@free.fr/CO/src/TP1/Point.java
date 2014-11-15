package TP1;

public class Point implements Comparable<Point> {

    public Point() { this(0.0, 0.0); }

    public Point(double x, double y) { 
	this.x = x; this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    /* definition d'une relation d'ordre totale sur Point
     * Cette definition est coherente par rapport a equals :
     * p1.compareTo(p2) == 0 ssi p1.equals(p2)
     * La seule difference est que compareTo prend un Pint en argument et leve
     * NullPointerException si son argument est null.
     */
    public int compareTo(Point p) {
        // System.out.println("On est dans compareTo de Point");
	if (this == p) return 0; /* test rapide qui ne mange pas de pain ! */
	if (x < p.x) return -1;
	else if (x > p.x) return +1;
	else if (y < p.y) return -1;
	else if (y > p.y) return +1;
	else return 0;
    }

    /** deux points sont egaux s'ils ont meme coordonnees */
    public boolean equals(Object o) {
        // System.out.println("On est dans equals de Point");
	if (o == null) return false;
	if (o == this) return true;
	if (o instanceof Point) {
	    Point D = (Point) o;
	    return D.x == x && D.y == y;
	} else { return false; }
    }
    
    /** permet a hashset de déterminer si 2 objets ont la meme valeur hashcode. Si c'est le cas, ils ont alors
     * une chance d'être egal. Pour vérifier cela, il va appeler equals.
     * Si par contre les 2 objets n'ont pas la meme valeur hashcode, il va considérer directement sans passer
     * par equals que les 2 objets sont différents
     */
    public int hashCode(){
    	return (int) (x + y);
    }

    public String toString() {
	return "(" + x + ", " + y + ")";
    }

    protected double x;
    protected double y;
}
