package by.htp.less.branchings; 

// �������� ���������, ������� �� �������� ���� ������ ����������, 
// �������� �� ����� �����-���� ���� �� ��� �������������.

import java.util.Scanner;

public class Task32 {
    public static void main(String[]args) {
		
 	int a,b,c; // �������� ����������
 			
 	Scanner sc = new Scanner (System.in);  // �������� �������
 			    
 	System.out.println("����������, ������� �������� ���� !!! ");
 			 
 	a = sc.nextInt();   // ���� � ����������
 	b = sc.nextInt();
 	c = sc.nextInt();
 	
 	if(a+b >0 || b+c >0 || a+c >0) {System.out.println(" ������������ ������������� ����� ");   } // ������� ���������� ������ �����
 	else {System.out.println(" ����������� ������������� ����� ");}
  
  
  }
}


