package ppti.oop.ds;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		BST<String> bst = new BST<String>(new Comparator<String>() {@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		bst.push("Kevin");
		bst.push("Budi");
		bst.push("Andi");
		bst.push("Danny");
		bst.push("Natan");
		bst.push("Alvin");
		bst.push("Jessica");
		bst.push("Marcel");
		
		bst.view();

	}

}
