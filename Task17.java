package by.htp.less.branchings;

import java.util.Scanner;

// ���� ����� ����� m, n.
// ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������, ������ �������� �� ��������,
// � ���� �����, �� �������� ����� ������.

public class Task17 {
	public static void main(String[]args) {
		
		int n , m ,a; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� ����� ����  ");
		 
		m = sc.nextInt();   // ���� �������� 1� 
		n = sc.nextInt();   // ���� �������� 2� 
		
		if(m == n) {
			
		m = 0;
		n = 0;
			System.out.println(" ����� �����  ");}   // 1 � �������
		else { System.out.println(" ����� �� �����  ");}
		
		if(m >n) { a = m;}                                 // 2 � �������
		else {a = n;}
		 
		m = a;
		n = a;
			System.out.println("����� ����� "+"\n M = "+m+"\n N = "+n); // ����� � �������
			
	}

}
