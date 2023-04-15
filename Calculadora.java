public class Calculadora{
    
    double num1, num2;
    char operador;

    public Calculadora(){}

    public void getValor(double x,char op, double y){
        num1 = x;
        num2 = y;
        operador = op;
    }


    public String calcula(int operador){
		
        String mensagem;

        switch (operador) {
            case '+':
                mensagem =  "Valor da soma: " +  (num1 + num2);
                break;
            case '-':
                mensagem =  "Valor da Subtracao: " +  (num1 - num2);
                break;
            case '%':
                if(num2 == 0){
                    mensagem =  "Valor não pode ser calculado(numerador negativo)";
                }else{
                    mensagem =  "Valor da divisao: " + (num1 / num2);
                }
                break;
            case '*':
                mensagem =  "Valor da multiplicação: "+ (num1 * num2); 
                break;
            case 'F':
                mensagem = "Finalizando programa ... ";
                break;

            case 'f':
                mensagem = "Finalizando programa ... ";
                break;
            default:
                mensagem = "Opcao digitada invalida !!";
                break;
        }

        return mensagem;
	}

    public char RetornaOperador(){
        return operador;
    }
}
