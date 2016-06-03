
//aqui foi criada a classe Calculadora

public class Calculadora {
	
	private String proprietario;
	
	public Calculadora(String nome){
		proprietario = nome;
	}
	
	//Executar a soma de dois valores e obter resultado.
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	
	//Executar subtração de dois valores e obter resultado.
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	
	//Multiplica o valor 1 pelo o valor 2
	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	//Potencia com valor 1 x o valor 2
	public int potencia(int valor1, int valor2) {
		int potencia = 1;
		for (int i = 0; i < valor2; i++) {
			potencia = potencia * valor1;
		}
		return potencia;
	}
	
	//Divisão implementação
	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
		
	}
	
	//Informar o resultado de uma operação par, onde o resto seja zero.
	public boolean ehPar(int valor) {
		return valor % 2 == 0;
	}
	while (x > 1){ 
  f = f *(x-1); x--; 
                    } 
	//Testando a calculadora!

	public String toString() {
		return "Calculadora de " + proprietario;
	}
}
