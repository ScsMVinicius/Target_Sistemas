import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número e descubra se ele faz parte" + " da sequência de Fibonacci: ");
		int N = sc.nextInt();

		boolean pertence = pertenceFibonacci(N);

		if (pertence) {
			System.out.println(N + " pertence à sequência de Fibonacci!");
		} else {
			System.out.println(N + " não pertence à sequência de Fibonacci!");
		}

		sc.close();
	}

	public static boolean pertenceFibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;

		while (c < n) {
			c = a + b;
			a = b;
			b = c;
		}

		return (c == n);

	}

}
