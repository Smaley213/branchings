package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ���������: ����� �� ��� ����� � � b?

public class Task04 {
	public static void main(String[]args) {
    	
	   	 int a ,b ; // �������� ����������
	   	 
	   	System.out.println("���������� ������� ���� ������������ ����� �� �������� !!");
	   	 
	   	Scanner h = new Scanner(System.in);
	   	
	   	a = h.nextInt();      // ���� ���������  
	   	
	    b = h.nextInt();

	   	 if (a == b) {                   // �������
	   		 
	   		 System.out.println("YES");
	   	 }
	   	 
	   	   if(a > b) {
	   		 
	   		 System.out.println("NO");
	   	 }
	   	   if(a < b) {
	   		 
	   		 System.out.println("NO");
	   	 }
	   	 
	   	 
	}

}
