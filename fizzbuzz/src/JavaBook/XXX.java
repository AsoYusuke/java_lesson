package JavaBook;

public class XXX {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 1 || i == 5) {
				System.out.println("-----");
			} else if (i % 2 == 0) {
				System.out.println("  |");
			} else {
				System.out.println("  |--");
			}

		}
	}

}
