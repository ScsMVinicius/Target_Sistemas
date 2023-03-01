import java.util.Locale;
import java.util.Scanner;

public class FaturamentoEstado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Faturamento Mensal\n" + "SP – R$67.836,43\r\n" + "RJ – R$36.678,66\r\n"
				+ "MG – R$29.229,88\r\n" + "ES – R$27.165,48\r\n" + "Outros – R$19.849,53\n");
		System.out.println();

		double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;

		double total = sp + rj + mg + es + outros;
		double percentSp = (sp * 100 / total);
		double percentRj = (rj * 100 / total);
		double percentMg = (mg * 100 / total);
		double percentEs = (es * 100 / total);
		double percentOutros = (outros * 100 / total);

		System.out.println("São Paulo Representa " + Math.round(percentSp) + "% do faturamento total");
		System.out.println("Rio de Janeiro Representa " + Math.round(percentRj) + "% do faturamento total");
		System.out.println("Minas Gerais Representa " + Math.round(percentMg) + "% do faturamento total");
		System.out.println("Espírito Santo Representa " + Math.round(percentEs) + "% do faturamento total");
		System.out.println("Outros Estados Representam " + Math.round(percentOutros) + "% do faturamento total");

		sc.close();

	}

}
