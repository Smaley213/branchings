package by.htp.less.branchings;

// ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.

import java.util.Scanner;

public class Task29 {

	public static void main(String[]args) {
		
               int x1,x2,x3,y1,y2,y3; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		 System.out.println("����������, ������� �������� � ���� !!! ");
		 
		x1 = sc.nextInt();   // ���� A
		y1 = sc.nextInt();
		
		System.out.println("����������, ������� �������� B ���� !!! ");
		
		x2 = sc.nextInt();  // ���� B
        y2 = sc.nextInt(); 
        
        System.out.println("����������, ������� �������� C ���� !!! ");
        
		x3 = sc.nextInt();  // ���� C
		y3 = sc.nextInt();
		
		
		if ((x1*y2 + x3*y1) + (x2*y3 - x3*y2) - (x2*y1) - (x1*y3) == 0)  // ������� ���������� // ����...
		   {System.out.println("�����") ;}

		else {System.out.println("�� �����") ;}

		//{y_2-y_1}{x_2-x_1}={y_3-y_1}{x_3-x_1}   /// ���� ������� ,����������� ����� 
		
	}

}
