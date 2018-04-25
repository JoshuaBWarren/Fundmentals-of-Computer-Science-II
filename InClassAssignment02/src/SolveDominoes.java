/*
 * Joshua Warren
 * 4/25/18
 * CS211
 * In class Assignment
 */
import java.util.*;   // for ArrayList

/*
 * Class given via Files tab within Course.
 */
public class SolveDominoes {
	public static void main(String[] args) {
		// [(1|4), (2|6), (4|5), (1|5), (3|5)]
		List<Domino> dominoes = new ArrayList<Domino>();
		dominoes.add(new Domino(1, 4));
		dominoes.add(new Domino(2, 6));
		dominoes.add(new Domino(4, 5));
		dominoes.add(new Domino(1, 5));
		dominoes.add(new Domino(3, 5));
		
		//System.out.println(dominoes);
		System.out.println(hasChain(dominoes, 5, 5));   // true
		System.out.println(hasChain(dominoes, 1, 5));   // true
		System.out.println(hasChain(dominoes, 1, 3));   // true
		System.out.println(hasChain(dominoes, 1, 6));   // false
		System.out.println(hasChain(dominoes, 1, 2));   // false
		//System.out.println(dominoes);
		}
	
	public static boolean hasChain(List<Domino> dominoes, int start, int end) {
	    Stack<Domino> chosen = new Stack<Domino>();
	    return hasChain(dominoes, chosen, start, end);
	}

	private static boolean hasChain(List<Domino> dominoes,
	                                Stack<Domino> chosen, int start, int end) {
	    if (start == end) {
	        System.out.println(chosen);
	        return true;                         // base case
	    } else {
	        for (int i = 0; i < dominoes.size(); i++) {
	            Domino d = dominoes.remove(i);   // choose
	            if (d.first() == start) {        // explore
	                chosen.push(d);
	                if (hasChain(dominoes, chosen, d.second(), end)) {
	                    return true;
	                }
	                chosen.pop();
	            } else if (d.second() == start) {
	            	d.flip();
	                chosen.push(d);
	                if (hasChain(dominoes, chosen, d.second(), end)) {
	                    return true;
	                }
	                chosen.pop();
	            }
	            dominoes.add(i, d);              // un-choose
	        }
	        return false;
	    }
	}
}