package by.htp.less.branchings;

import java.util.Scanner;

// ���� ��� �������������� �����. 
// �������� � ������� �� �� ���, �������� ������� ��������������, � � ��������� ������� � �������������.

public class Task12 {
	public static void main(String[]args) {
		
		int n1 ,n2 ,n3 , n4, n5, n6;
		
      Scanner sc = new Scanner (System.in);  // �������� �������
	    
	    System.out.println("����������, ������� ����� �� �������� ���� ");
	 
	n1 = sc.nextInt();   // ���� �������� ������ 1 ������������
	n2 = sc.nextInt(); 
	n3 = sc.nextInt(); 
	
	
	System.out.println("�� ����� 3 ����� "+n1+n2+n3);
	
	if ( n1 >=0) {                             // ������ ��� 1 � �����
		n4 = (int)Math.pow(n1, 2);                            // �������� � �������
		System.out.println("����� "+n1+" � ������� 2 = "+n4);}
	
		else { n4 = (int)Math.pow(n1, 4);                     // �������� � �������
		System.out.println("����� "+n1+" � ������� 4 = "+n4);}
		
	if ( n2 >=0) {                            // ������ ��� 2 � �����
		n5 = (int)Math.pow(n2, 2);
		System.out.println("����� "+n2+" � ������� 2 = "+n5);}
	
		else { n5 = (int)Math.pow(n2, 4);                     // �������� � �������
		System.out.println("����� "+n2+" � ������� 4  = "+n5);}
	
	if ( n3 >=0) {                            // ������ ��� 3 � �����
		n6 = (int)Math.pow(n3, 2);
		System.out.println("����� "+n3+" � ������� 2 = "+n6);}
	
		else { n6 = (int)Math.pow(n3, 4);                     // �������� � �������
		System.out.println("����� "+n3+" � ������� 4 = "+n6);}
	
	}

	
}
