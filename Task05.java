package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ���������: ����������� ����������� �� ���� ����� � � b.

public class Task05 {
	public static void main(String[]args) {
		
	  int a, b ;  //�������� ����������
		
		  Scanner s = new Scanner (System.in);
		    
		    System.out.println("���������� ������� ����� �  !!");
		 
		a = s.nextInt();   // ���� �������� �
		
		    System.out.println("���������� ������� ����� B  !!");
		
		b = s.nextInt();   // ���� �������� �
		 
		   if (a<b) {                                    // ������� ���������
			
			  System.out.println("A ������� ��� B ");
		}
		
            if (a>b) {
			
			  System.out.println("\n A ������ ��� B ");
		}
		
	}

}
