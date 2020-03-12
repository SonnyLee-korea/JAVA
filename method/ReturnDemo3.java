package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {
	public static String num(int i) {
		if(i==0) {
			return "Zero";
		}
		else if(i==1) {
			return "one";
		}
		else if(i==2) {
			return "two";
		}
		return "None";
	}
	
	public static void main(String[] args) {
		System.out.println(num(1));

	}

}
