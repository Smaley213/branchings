package by.htp.less.branchings;

import java.util.Scanner;

// ���������� ���������� ������������� ����� ����� �, b, �.

public class Task19 {
	public static void main(String[]args) {
		

		int a, b, c ,x = 0 ; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� 3 ����� ���� �� �������  ");
		 
		a = sc.nextInt();   // ���� ��������  
		b = sc.nextInt();    
		c = sc.nextInt();    
		
		if(a<0 & b<0 & c<0) {System.out.println("��� ����� ������������� ");}
		
		else{System.out.println("���� �������������  ");}
		
		if(a>0) {x = x+1;}
		if(b>0) {x = x+1;}
		if(c>0) {x = x+1;}
		
		System.out.println("���������� ������������� ����� = "+x);
		
		
	}

}
