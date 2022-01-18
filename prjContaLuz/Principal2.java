package prjContaLuz;
import java.util.Scanner;
public class Principal2 {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		contaLuz conta = new contaLuz();
		
		System.out.print("\n Digite a data da leitura do relógio da sua residência: ");
		conta.dataRelogio = in.next();
		System.out.print("\n Digite o número da leitura do relógio da sua residência: ");
		conta.numeroLeitura = in.nextInt();
		System.out.print("\n Digite o kw gasto do mês da sua conta de luz: ");
		conta.kwMes = in.nextInt();
		System.out.print("\n Digite o valor a pagar pela sua conta de luz: ");
		conta.valorConta = in.nextDouble();
		System.out.print("\n Digite a data de pagamento da sua conta de luz: ");
		conta.dataPagamento = in.next();
		System.out.print("\n Digite a média mensal de consumo de sua conta de luz: ");
		conta.mediaConsumo = in.nextDouble();
		System.out.print("\n Digite o menor consumo de sua conta de luz: ");
		conta.menorConsumo = in.nextDouble();
		System.out.print("\n Digite o maior consumo de sua conta de luz: ");
		conta.maiorConsumo = in.nextDouble();
		System.out.println("\n Dados sobre sua conta de luz: "+
				           "\n  A data da leitura do relógio da sua residência é: " +conta.dataRelogio+
				           "\n  O número da leitura do relógio da sua residência é: " +conta.numeroLeitura+
				           "\n A quantidade de kw gasto do mês de sua conta é:  " +conta.kwMes+
				           "\n O valor de sua conta é:  " +conta.valorConta+
				           "\n  A data de pagamento de sua conta é: "+conta.dataPagamento+
				           "\n A média de consumo de sua conta é: "+conta.mediaConsumo+
				           "\n \n A seguir a análise de menor e maior consumo de sua conta dos dois últimos meses: "+
				           "\n O menor consumo de sua conta é: "+conta.menorConsumo+
				           "\n O maior consumo de sua conta é: "+conta.maiorConsumo);
	}
	

}

