package by.htp.less.branchings;

import java.util.Scanner;

// ���� ��� ����� �(�1, �1) � �(�2, �2). 
// ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������.

public class Task13 {
      public static void main(String[]args) {
		
		int a , b, x1, x2, y1 ,y2 ; // 
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� ����� ����� � ����  ");
		 
		x1 = sc.nextInt();   // ���� �������� 1� �����
		y1 = sc.nextInt();
		
		System.out.println("����������, ������� ����� ����� � ����  ");
		
		x2 = sc.nextInt();   // ���� �������� 2� �����
		y2 = sc.nextInt(); 
		
		a = (int)Math.sqrt((x1*x1)+(y1*y1));
		
		b = (int)Math.sqrt((x2*x2)+(y2*y2));
		
		if(a>b) {System.out.println("����� � ����� ");
		}else {System.out.println("����� B ����� ");}
		
	}

}
