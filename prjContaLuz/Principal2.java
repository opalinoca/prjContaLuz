package prjContaLuz;
import java.util.Scanner;
public class Principal2 {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		contaLuz conta = new contaLuz();
		
		System.out.print("\n Digite a data da leitura do rel�gio da sua resid�ncia: ");
		conta.dataRelogio = in.next();
		System.out.print("\n Digite o n�mero da leitura do rel�gio da sua resid�ncia: ");
		conta.numeroLeitura = in.nextInt();
		System.out.print("\n Digite o kw gasto do m�s da sua conta de luz: ");
		conta.kwMes = in.nextInt();
		System.out.print("\n Digite o valor a pagar pela sua conta de luz: ");
		conta.valorConta = in.nextDouble();
		System.out.print("\n Digite a data de pagamento da sua conta de luz: ");
		conta.dataPagamento = in.next();
		System.out.print("\n Digite a m�dia mensal de consumo de sua conta de luz: ");
		conta.mediaConsumo = in.nextDouble();
		System.out.print("\n Digite o menor consumo de sua conta de luz: ");
		conta.menorConsumo = in.nextDouble();
		System.out.print("\n Digite o maior consumo de sua conta de luz: ");
		conta.maiorConsumo = in.nextDouble();
		System.out.println("\n Dados sobre sua conta de luz: "+
				           "\n  A data da leitura do rel�gio da sua resid�ncia �: " +conta.dataRelogio+
				           "\n  O n�mero da leitura do rel�gio da sua resid�ncia �: " +conta.numeroLeitura+
				           "\n A quantidade de kw gasto do m�s de sua conta �:  " +conta.kwMes+
				           "\n O valor de sua conta �:  " +conta.valorConta+
				           "\n  A data de pagamento de sua conta �: "+conta.dataPagamento+
				           "\n A m�dia de consumo de sua conta �: "+conta.mediaConsumo+
				           "\n \n A seguir a an�lise de menor e maior consumo de sua conta dos dois �ltimos meses: "+
				           "\n O menor consumo de sua conta �: "+conta.menorConsumo+
				           "\n O maior consumo de sua conta �: "+conta.maiorConsumo);
	}
	

}

