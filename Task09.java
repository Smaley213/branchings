package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ���������, ������� ��������� �� ���� ��������� ��������, �������� �� ������ ����������� ��������������.

public class Task09 {
	
	public static void main(String[]args) {
		
		  int a, b , c ;  //�������� ����������
			
			  Scanner s = new Scanner (System.in);
			    
			    System.out.println("���������� ������� ����� ������� �  !!");
			 
			a = s.nextInt();   // ���� �������� �
			
			    System.out.println("���������� ������� ����� �������  B  !!");
			
			b = s.nextInt();   // ���� �������� �
			 
                System.out.println("���������� ������� ����� �������  C  !!");
			
			c = s.nextInt();   // ���� �������� C
			
			 if (a < b || b > c || b < c){
				 System.out.println("����������� �� �������������� "); // ����� �� �����
				 }
			 
			 if (a == b && b ==c ){
				
				 System.out.println(" ��� ,�����������  �������������� "); // ����� �� �����
			 }
			 
	   }
	

}
