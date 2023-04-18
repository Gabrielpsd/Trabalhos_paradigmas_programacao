import javax.swing.*;

public class InterfaceCalculadora {


	/* le um numero do usuario e retorna esse numero, não recebe parametros e retorna 
	 * um float para o usuario;
	 */
	public double pegaNumero () {
		String valor;
		double n;
		
		valor = JOptionPane.showInputDialog ("Numero");
		n = Double.parseDouble(valor);		
		
		return n;
	}

	/* ----------mensagem de inico de progrma não contem nenhum retorno - --------- */
	public void Inicia(){
		JFrame f = new JFrame();

		JOptionPane.showMessageDialog(f,"Inicializando Calculadora \n clique em Ok para confirmar ");
	}


	//Imprime o resultado inteiro na tela
	public void imprimeResultado (String resultado) {
		JFrame f = new JFrame();
		JOptionPane.showMessageDialog(f,"Resultado = "+ resultado);
	}


		/*	|------------- Realiza a leitura do operador -------------------|
		 * 	|   	O metodo a seguir realiza a leitura do operador 		|
		 *	|	do principal utilizado no programa, o programa ficara 		|
		 *	|	em looping até que seja digitado um valor de operador valido|												|
		 * 	|---------------------------------------------------------------|
		 */
	public char selecionaOperador(){
		String entrada;
		char retorno;
		JFrame f = new JFrame();
			
		do{
			entrada = JOptionPane.showInputDialog("(+) - soma \n (-) - Subtrai num1 de num2 \n (%) - divide num1 por num2 \n (*) - multiplica \n");
			retorno = entrada.charAt(0);

			if(retorno == '+' || retorno == '-' || retorno == '*' || retorno == '%')
				return retorno;
			else
				JOptionPane.showMessageDialog(f,"Operador DIgitado invalido");
		
		}while(true);

	}

		/*	|------------- Realiza a leitura do operador -------------------|
		 * 	|   	nesse metodo ele realiza a leitura do operador novamente|
		 * 	|	como o operador é nosso criterio de parada, nos precisamos 	|
		 * 	|	ler ele novamente para saber se o usuario quer continuar 	|
		 * 	|	utilizando o progama;										|
		 * 	|---------------------------------------------------------------|
		 */
	public char finalizaProg(){
		String entrada;

		entrada = JOptionPane.showInputDialog("Deseja continuar ?? (F) - nao (outra tecla) - sim ");

		return entrada.charAt(0);
	}
}


