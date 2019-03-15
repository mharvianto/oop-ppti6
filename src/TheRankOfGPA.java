import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TheRankOfGPA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Double> gpa = new ArrayList<Double>();
		int n;
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			double d = in.nextDouble();
			gpa.add(d);
		}
		gpa.sort(Comparator.reverseOrder());
		int rank = 0, i = 0;
		for (Double d : gpa) {
//			System.out.println(gpa.get(rank)+" - "+d);
			if (!gpa.get(rank).equals(d)) {
				rank = i;
			}
			System.out.printf("%d %.2f\n", rank, d);
			i++;
		}
		in.close();
	}

}
