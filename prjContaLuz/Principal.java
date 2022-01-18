package prjContaLuz;
import java.util.Scanner;

import javax.swing.JOptionPane;
class Principal {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		contaLuz CL1 = new contaLuz();
		
		CL1.dataRelogio = JOptionPane.showInputDialog(null, "Digite a data da leitura do relógio da sua residência: ");
		CL1.numeroLeitura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da leitura do relógio da sua residência: "));
		CL1.kwMes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o kw gasto do mês da sua conta de luz: "));
		CL1.valorConta = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a pagar pela sua conta de luz: "));
		CL1.dataPagamento = JOptionPane.showInputDialog(null, "Digite a data de pagamento da sua conta de luz: ");
		CL1.mediaConsumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a média mensal de consumo de sua conta de luz: "));
		CL1.menorConsumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o menor consumo de sua conta de luz: "));
		CL1.maiorConsumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o maior consumo de sua conta de luz: "));
		
		JOptionPane.showMessageDialog(null, "\n Dados sobre sua conta mensal de luz: "+
		                                    "\n A data da leitura do relógio da sua residência é: " +CL1.dataRelogio+
		                                    "\n O número da leitura do relógio da sua residência é: " +CL1.numeroLeitura+
		                                    "\n A quantidade de kw gasto do mês de sua conta é: " +CL1.kwMes+
		                                    "\n O valor de sua conta é: " +CL1.valorConta+
		                                    "\n A data de pagamento de sua conta é: " +CL1.dataPagamento+
		                                    "\n A média de consumo de sua conta é: " +CL1.mediaConsumo+
		                                    "\n \n A seguir a análise de menor e maior consumo de sua conta dos dois últimos meses: "+
		                                    "\n O menor consumo de sua conta é: " +CL1.menorConsumo+
		                                    "\n O maior consumo de sua conta é: " +CL1.maiorConsumo);
	}
}


