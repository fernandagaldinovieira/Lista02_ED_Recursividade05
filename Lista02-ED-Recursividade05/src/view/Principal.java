package view;

import controller.MaximoDivisorController;

public class Principal {

	public static void main(String[] args) {

		MaximoDivisorController maximoDivisor = new MaximoDivisorController();
		
		int A = 120;
		int B = 150;
		int resultado = maximoDivisor.MDC(A, B);
		System.out.println("O Máximo Divisor Comum de " + A + " e " + B + " é igual a: " + resultado);
	}

}
