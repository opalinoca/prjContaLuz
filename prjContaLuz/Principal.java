package prjContaLuz;
import java.util.Scanner;

import javax.swing.JOptionPane;
class Principal {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		contaLuz CL1 = new contaLuz();
		
		CL1.dataRelogio = JOptionPane.showInputDialog(null, "Digite a data da leitura do rel�gio da sua resid�ncia: ");
		CL1.numeroLeitura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero da leitura do rel�gio da sua resid�ncia: "));
		CL1.kwMes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o kw gasto do m�s da sua conta de luz: "));
		CL1.valorConta = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a pagar pela sua conta de luz: "));
		CL1.dataPagamento = JOptionPane.showInputDialog(null, "Digite a data de pagamento da sua conta de luz: ");
		CL1.mediaConsumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a m�dia mensal de consumo de sua conta de luz: "));
		CL1.menorConsumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o menor consumo de sua conta de luz: "));
		CL1.maiorConsumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o maior consumo de sua conta de luz: "));
		
		JOptionPane.showMessageDialog(null, "\n Dados sobre sua conta mensal de luz: "+
		                                    "\n A data da leitura do rel�gio da sua resid�ncia �: " +CL1.dataRelogio+
		                                    "\n O n�mero da leitura do rel�gio da sua resid�ncia �: " +CL1.numeroLeitura+
		                                    "\n A quantidade de kw gasto do m�s de sua conta �: " +CL1.kwMes+
		                                    "\n O valor de sua conta �: " +CL1.valorConta+
		                                    "\n A data de pagamento de sua conta �: " +CL1.dataPagamento+
		                                    "\n A m�dia de consumo de sua conta �: " +CL1.mediaConsumo+
		                                    "\n \n A seguir a an�lise de menor e maior consumo de sua conta dos dois �ltimos meses: "+
		                                    "\n O menor consumo de sua conta �: " +CL1.menorConsumo+
		                                    "\n O maior consumo de sua conta �: " +CL1.maiorConsumo);
	}
}


