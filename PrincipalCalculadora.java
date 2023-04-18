/* alunos: Gabriel Pereira 
 * 			Kelvil Kaua 
 * Data de modificação: 18/04/2023
 * 
 * Funcao do programa: realiza as quatro operacoes matematicas basicas em looping até que o usuario
 * digite o comando correto para o encerramento do programa; 
 * 
 * 
 * metodo de compilacao: javac principalcalculadora.java
 * 
 */

public class PrincipalCalculadora{

	public static void main (String[] parametros) {
	
		/* --------------------declaração das variaveis e classes utilizadas no programa---------- */
		InterfaceCalculadora umaInterface = new InterfaceCalculadora();
		Calculadora calc = new Calculadora();
		char operador;

		/* mostra a mensagem inicial do programa, que indica que o programa esta iniciando */
		umaInterface.Inicia();

		/*	|------------- funcao principal do programa --------------------|
		 * 	|   	O programa ficara executando ate que o usuario digite	|
		 * 	|	o comando especifico para finalizar o programa, nesse caso	|
		 * 	|	a letra F;													|
		* 	|---------------------------------------------------------------|
		 */
		do{

			/*	|---------------------- funcao getValor ------------------------|
			* 	|   	Das as funcoes passadas em cal.Getvalor elas retornam	|
			*	|	Valores que irao ser atualizados dentro da classe, assim	|
			*	|	eu posso utilizar as outras funcoes das outras classes 		|
			*	|	sem a necessidade do usuario ficar digitando quando for 	|
			*	|	necessario, ele digitara apenas na chamada da funcao 		|
			*	|	Getvalor													|
			*	|---------------------------------------------------------------|
			*/
			calc.getValor(umaInterface.pegaNumero(),umaInterface.selecionaOperador(),umaInterface.pegaNumero());
	

			/*imprime o valor realizando a chama da funcao que calcula */
			umaInterface.imprimeResultado(calc.calcula());

			/* 	|------------------------operador-------------------------------|
				|		O operador aqui é nosso criterio para a finalizacao		|
				|	do programa, logo preciso fazer a leitura novamente,		|
				|	porem com outra classe na interface para que eu consiga		|
				|	filtrar o valor com outros criterios necessarios. 			|
				|---------------------------------------------------------------|	
			*/
			operador = umaInterface.finalizaProg();

		}while(operador != 'F' && operador != 'f');

		
	}
}


