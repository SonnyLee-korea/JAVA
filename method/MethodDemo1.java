package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	public static void numbering(int init, int limit) {
		for(int i=init;i<limit;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		for(int j=0;j<5;j++) {
			numbering(2,5);
		}

	}

}
