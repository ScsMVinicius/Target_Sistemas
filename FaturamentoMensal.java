import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FaturamentoMensal {

	public static void main(String[] args) throws FileNotFoundException {

		// Carrega os dados de faturamento mensal a partir do arquivo JSON: "dados".
		Gson dados = new Gson();
		FaturamentoDiario[] faturamento = dados.fromJson(new FileReader("dados.json"), FaturamentoDiario[].class);

		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		int diasAcimaMedia = 0;

		for (FaturamentoDiario dia : faturamento) {
			// Os dias sem faturamento não vão ser considerados.
			if (dia.valor > 0) {
				soma += dia.valor;
				if (dia.valor < menor) {
					menor = dia.valor;
				}
				if (dia.valor > maior) {
					maior = dia.valor;
				}
			}
		}

		int numDias = faturamento.length;
		double media = soma / numDias;

		for (FaturamentoDiario dia : faturamento) {
			if (dia.valor > media) {
				diasAcimaMedia++;
			}
		}

		System.out.printf("O menor faturamento diário foi : R$ %.2f\n", menor);
		System.out.printf("O maior faturamento diário: R$ %.2f\n", maior);
		System.out.printf("Número de dias em que o  faturamento foi superior à média mensal: %d dias", diasAcimaMedia);
	}

	private static class FaturamentoDiario {
		int dia;
		double valor;
	}
}
