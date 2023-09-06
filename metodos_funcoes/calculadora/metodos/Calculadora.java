package calculadora.metodos;
import java.lang.Math;

public class Calculadora {
	
	public static float soma(float numero1, float numero2) {
		return numero1 + numero2;
	}

	public static float subtracao(float numero1, float numero2) {
		return numero1 - numero2;
	}

	public static float multiplicacao(float numero1, float numero2) {
		return numero1 * numero2;
	}

	public static float divisao(float numero1, float numero2) {
		return numero1 / numero2;
	}
	public static float resto(float numero1, float numero2) {
		return numero1 % numero2;
	}
	public static float potencia(float numero1, float numero2) {
		double potenciacao = Math.pow(numero1, numero2);
		return (float)potenciacao;
	}
	public static float raiz(float numero1, float numero2) {
		double radiciacao = Math.pow(numero1, (1 / numero2));
		return (float)radiciacao;
	}
}