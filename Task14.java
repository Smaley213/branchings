package by.htp.less.branchings;

import java.util.Scanner;

//  ���� ��� ���� ������������ (� ��������). 
// ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.

public class Task14 {
	public static void main(String[]args) {
		
		int a , b ; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� �������� 2� ����� � �������� ����  ");
		 
		a = sc.nextInt();   // ���� �������� 1� �����
		b = sc.nextInt();
		
		if(a+b<180) {System.out.println("����������� ����������  ");
		}
		else { System.out.println("�����������  �� ���������� ");}
		
		if(a==90 || b==90 || a+b==90) {System.out.println("����������� ������������� ");
		}
		else { System.out.println("�����������  �� ������������� ");}
		
		
	}

}
