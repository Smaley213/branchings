package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.

public class Task08 {
	public static void main(String[]args) {
		
		  int a, b ,s1 ,s2 ;  //�������� ����������
			
			  Scanner s = new Scanner (System.in);
			    
			    System.out.println("���������� ������� ����� �  !!");
			 
			a = s.nextInt();   // ���� �������� �
			
			    System.out.println("���������� ������� ����� B  !!");
			
			b = s.nextInt();   // ���� �������� �
			 
			 s1 = a*2;       // ������� ������ 
			 s2 = b*2;
			 
			 if (s1 < s2){
				 System.out.println("����� ����� � � �������� , ��������� "); // ����� �� �����
			 }
			 if (s1 > s2){
				 System.out.println("����� ����� B � �������� , ��������� "); // ����� �� �����
			 }
			
		}

}
