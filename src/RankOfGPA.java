import java.util.Arrays;
import java.util.Scanner;

public class RankOfGPA {

	public static void main(String[] args) {
		double gpa[] = new double[200];
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			gpa[i] = in.nextDouble();
		}
		Arrays.sort(gpa, 0, n);
		int rank = 1;
		for (int i = n-1; i >= 0; i--) {
			if(gpa[i] != gpa[i+1]) {
				rank = n-i;
			}
			System.out.printf("%d %.2f\n", rank, gpa[i]);
		}
		in.close();
	}

}
