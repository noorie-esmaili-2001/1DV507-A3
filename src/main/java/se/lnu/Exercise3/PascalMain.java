package ne222hz_assign3.Exercise3;

public class PascalMain {
	public static void main(String[] args) {
		print(0);
		System.out.println();
		print(1);
		System.out.println();
		print(2);
		System.out.println();
		print(3);
		System.out.println();
		print(4);
		System.out.println();
		print(5);
	}

	public static void print(int n) {

		for (int j = 0; j <= n; j++) {
			System.out.print(pascal(n, j) + " ");

		}
	}

	public static int pascal(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}

}
