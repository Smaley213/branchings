package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ���������, ������������ ��������� ������� �� ������� � �������� �����,
// ���� �� �������� ������ ���������� ��������� �.

public class Task24 {
	public static void main(String[]args) {
		
		int n; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� ���������� ��������� ,���� �� �������  ");
		 
		n = sc.nextInt();   // ���� ���������� ���������
		
	 
		if(n % 2 == 0) {System.out.println("\n �� ����� =( ");}   // ������� ������������  � ����� �� �����
		else {System.out.println("\n ����� =) ");}
		
	}

}
