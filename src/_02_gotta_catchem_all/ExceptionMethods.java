package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double num, double den) {
		double quotient = 0;
		if(den==0.0) {
			throw new IllegalArgumentException();
		} else {
			quotient = num/den;
		}
		return quotient;
	}
	public static String reverseString(String str) {
		String result = "";
		if(str=="") {
			throw new IllegalStateException();
		} else {
			for (int i = str.length()-1; i >= 0; i--) {
				//str.charAt(str.length()-1-i);
				result+=str.charAt(i);
			}
		}
		return result;
	}
	
}
