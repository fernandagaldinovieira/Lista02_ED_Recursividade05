package controller;

public class MaximoDivisorController {

	public MaximoDivisorController() {
		super();
	}

	public int MDC(int A, int B) {
		if (B == 0) {
			return A;
		} else {
			return MDC(B, A % B);
		}
	}
}
