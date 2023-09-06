package iniciar_calculadora;

import java.util.Scanner;
import calculadora.metodos.Calculadora;

public class minha_calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1 = 0, numero2 = 0;

		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextFloat();

		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextFloat();

		// Exibe o Resultado de cada Operação Matemática:
		System.out.println("Soma = " + Calculadora.soma(numero1, numero2));
		System.out.println("Subtração = " + Calculadora.subtracao(numero1, numero2));
		System.out.println("Multiplicação = " + Calculadora.multiplicacao(numero1, numero2));
		System.out.println("Divisão = " + Calculadora.divisao(numero1, numero2));
		System.out.println("Resto = " + Calculadora.resto(numero1, numero2));
		System.out.println("Potenciação = " + Calculadora.potencia(numero1, numero2));
		System.out.println("Raiz = " + Calculadora.raiz(numero1, numero2));

		// Finaliza o Objeto leia
		leia.close();

	}

}