package by.htp.less.branchings;

import java.util.Scanner;

// �������� ��������� � ������ ������� ��������� ������� � ���������, 
// ������� ������� ��������� �������������� �������� �, ���� ����������� � ������� ��������� 60� �.

public class Task25 {
	public static void main(String[]args) {
		
               int t; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� ����������� ���� !!! ");
		 
		t = sc.nextInt();   // ���� �����������
		
		if(t>60) {System.out.println("\n ��������, ������ ������� ����������� !!! "); }
		
		if(t>30 & t<60) {System.out.println("\n ����������� � ���������� �������� !!! ");}
		
		if(t<30) {System.out.println("\n ����������� ���������� !!! ");}
		
	}

}
