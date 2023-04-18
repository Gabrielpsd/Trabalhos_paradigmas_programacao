public class Calculadora{
    
    double num1, num2;
    char operador;

    /* metodo constutor */
    public Calculadora(){}

    /* reliza a alteracaos dos valores da classe  */
    public void getValor(double x,char op, double y){
        num1 = x;
        num2 = y;
        operador = op;
    }

        /*	|------------- calcula  ----------------------------------------|
		 * 	|   	O metodo pega os valores da classe e seu respectivo     |
         *  |   operador e realiza as operações devidas e retorna esse      |
         *  |    valor para o usuario, o retorno é em formato de uma classe |
         *  |    String     												|
		* 	|---------------------------------------------------------------|
		 */
    public String calcula()
    {
		
        String mensagem = "0";

        switch (operador)
        {
            case '+':
                mensagem =  "Valor da soma: " +  (num1 + num2);
                break;
            case '-':
                mensagem =  "Valor da Subtracao: " +  (num1 - num2);
                break;
            case '%':
                if(num2 == 0)
                {
                    mensagem =  "Valor não pode ser calculado(numerador negativo)";
                }
                else
                {
                    mensagem =  "Valor da divisao: " + (num1 / num2);
                }
                break;
            case '*':
                mensagem =  "Valor da multiplicação: "+ (num1 * num2); 
                break;
        }

        return mensagem;
	}

    /*  retorna o operador armazenado */
    public char RetornaOperador(){
        return operador;
    }
}
