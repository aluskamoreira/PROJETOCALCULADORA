
//aqui foi criada a classe Calculadora

public class Calculadora {
	
	private String proprietario;
	
	public Calculadora(String nome){
		proprietario = nome;
	}
	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	//executar a soma de dois valores e obter resultado.
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	//aqui multiplica o valor 1 x o valor 2
	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	//aqui faz a potencia com 0 valor 1 x o valor 2
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
//Testando a calculadora!

	public String toString() {
		return "Calculadora de " + proprietario;
	}
}
