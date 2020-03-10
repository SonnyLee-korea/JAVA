package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		if(a.equals("egoing")) {
			if(b.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}

	}

}
