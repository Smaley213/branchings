package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ���������, ������� ��������� ������� ������ ������������ ������

public class Task11 {
	public static void main(String[] args ) {
		
		int a,b,c,a2,b2,c2,p,p2; //�������� ����������
		double s,s2;
		
		Scanner sc = new Scanner (System.in);  // �������� �������
	    
	    System.out.println("����������, ������� �������� ������ 1 ������������ ���������� ���� ");
	 
	a = sc.nextInt();   // ���� �������� ������ 1 ������������
	b = sc.nextInt(); 
	c = sc.nextInt(); 
	
	     System.out.println("����������, ������� �������� ������ 2 ������������ ���������� ���� ");
	     
	a2 = sc.nextInt();   // ���� �������� ������ 1 ������������
	b2 = sc.nextInt(); 
	c2 = sc.nextInt(); 
	
	p = (a+b+c)/2;                                   // ���������� 1-�� ������������
	s = (int)Math.sqrt(p * (p-a) * (p-b) * (p-c));
	
	p2 = (a2 + b2 + c2) /2;                                   // ���������� 2-�� ������������
	s2 = (int)Math.sqrt(p2 * (p2-a2) * (p2-b2) * (p2-c2)); 
	
	if (s > s2) {   //----------------------------------------------------   //�������
		
		System.out.println("������� 1 -�� ������������ ������ � = "+s);   //����� ���������� � �������
		
	}if (s < s2) {

	   System.out.println("������� 2 -�� ������������ ������ � = "+s2);   //����� ���������� � �������
	  }
	
		
	}

}
