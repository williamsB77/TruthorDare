import java.util.ArrayList;

/** Defined the question bank that holds the commands for display
 * 
 */
public class QBank {
	
	private ArrayList<String> aBank;
	
	public QBank() {
		aBank = new ArrayList<String>();
	}
	
	public void add(String e) {
		aBank.add(e);
	}
	
	public void change(int x, int y) {
		// Switches the position of 2 questions in the bank
		if (x<aBank.size() && y<aBank.size()) {
			String A = aBank.get(x);
			String B = aBank.get(y);
			
			aBank.set(y, A);
			aBank.set(x, B);
		}
	}
	
	public String view() {
		// Finds and displays the first question in the bank
		if (aBank.isEmpty() != true) {
			String first = aBank.get(0);
			return first;
		} else {
			return null;
		}
	}
	
	public String view(int a) {
		if (aBank.isEmpty() != true) {
			String s = aBank.get(a);
			return s;
		} else {
			return null;
		}
	}
	
	public boolean find(String k) {
		// Finds the question within the bank -- Basically a search
		if (aBank.contains(k) == true) {
			return true;
		} else {
			return false;
		}
	}

}
