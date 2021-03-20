package Tennant.Joshua.Chapter7.Java.Project;

public class SimpleMath {
	double divide (double a, double b) {
		
		if(b == 0) {
			throw new ArithmeticException("dividing a number by 0 is not allowed in this program");
		}
		
		return a/b;
	}
	
	double multiply (double a, double b) {
		return a*b;
	}
}