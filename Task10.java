package by.htp.less.branchings;

import java.util.Scanner;



// ��������� ���������, ������� ��������� ������� ������ ����� ������.

public class Task10 {
	public static void main(String[]args) {
		
		  int a, b , r ;  //�������� ����������
		  double s1, s2;
	
		  Scanner sc = new Scanner (System.in);
		    
		    System.out.println("���������� ������� ������ 1-�� �����  !!");
		 
		a = sc.nextInt();   // ���� ��������  1-�� �����
		
		    System.out.println("���������� ������� ������ 2-�� �����  !!");
		 
	    b = sc.nextInt();   // ���� ��������  2-�� �����
	    
	    s1 = Math.PI *(a *2);
	    
	    s2 = Math.PI *(b *2);
	    
	     if (s1 == s2) {
	    	 System.out.println("������� 1-�� � 2-�� ����� ����� !!");
	    	 
	     }
	     if (s1 > s2) {
	    	 System.out.println("������� 2-�� ����� ������ � = " +s2);
	    	 
	     }
	     if (s1 < s2) {
	    	 System.out.println("������� 1-�� ����� ������ � = "+s1);
	    	 
	     }
	     
	}

}
