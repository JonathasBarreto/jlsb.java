package thirdclass;

import java.lang.Math;
public class Calculadora {
	public int adicao(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	public int subtracao(int num1, int num2) {
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	public int multiplicacao(int num1, int num2) {
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	public int divisao(int num1, int num2) {
		int resultado;
		resultado = num1 / num2;
		return resultado;
	}
	public int potenciacao(int num1, int num2) {
		int resultado;
		resultado = (int) Math.pow(num1, num2);
		return resultado;
	}
}
