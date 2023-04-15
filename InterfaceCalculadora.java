import javax.swing.*;

public class InterfaceCalculadora {

	public double pegaNumero () {
		String valor;
		double n;
		
		valor = JOptionPane.showInputDialog ("Numero");
		n = Double.parseDouble(valor);		
		
		return n;
	}

	public void Inicia(){
		JFrame f = new JFrame();

		JOptionPane.showMessageDialog(f,"Inicializando Calculadora \n clique em Ok para confirmar ");
	}


	//Imprime o resultado inteiro na tela
	public void imprimeResultado (String resultado) {
		JFrame f = new JFrame();
		JOptionPane.showMessageDialog(f,"Resultado = "+ resultado);
	}

	public char selecionaOperador(){
		String entrada;

		entrada = JOptionPane.showInputDialog("(+) - soma \n (-) - Subtrai num1 de num2 \n (%) - divide num1 por num2 \n (*) - multiplica \n  (f) - encerrar");
		return entrada.charAt(0);

	}
}


