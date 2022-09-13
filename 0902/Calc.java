package top01;

public class Calc {
	double result;

	double plus(double a, double b) {
		result = a + b;
		return result;
	}

	double sub(double a, double b) {
		result = a - b;
		return result;
	}

	double mult(double a, double b) {
		result = a * b;
		return result;
	}

	double div(double a, double b) {
		result = a / b;
		return result;
	}

	double per(double a, double b) {
		result = a % b;
		return result;
	}

}
