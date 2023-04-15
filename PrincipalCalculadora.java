public class PrincipalCalculadora{

	public static void main (String[] parametros) {
	
		InterfaceCalculadora umaInterface = new InterfaceCalculadora();
		Calculadora calc = new Calculadora();

		char operador;
		//n = calc.fatorialDoWhile(umaInterface.pegaNaoNegativo ());
		//n = calc.fatorialWhile(umaInterface.pegaNaoNegativo ());
		//n = calc.fatorialFor(umaInterface.pegaNaoNegativo ());
		
		umaInterface.Inicia();

		do{

			calc.getValor(umaInterface.pegaNumero(),umaInterface.selecionaOperador(),umaInterface.pegaNumero());
			operador = calc.RetornaOperador();

			umaInterface.imprimeResultado(calc.calcula(operador));

		}while(operador != 'F' && operador != 'f');

		
	}
}


