package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;

public class MethodDemo6 {
	public static String numbering(int init,int limit) {
		String k="";
		for(int i=init;i<limit;i++) {
			k+=i;
		}
		return k;
	}

	public static void main(String[] args) { // void�� ���ϰ��� �������� �ʴ´�
		for(int j=0;j<5;j++) {
			String result =numbering(1,4);
			System.out.println(result);
		}
		//try {
			//BufferedWriter out=new BufferedWriter(new FileWriter("out.txt"));
			//out.write(result);
			//out.close();
		//}catch (IOEXception e);

	}

}
