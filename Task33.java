package by.htp.less.branchings;

// �������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������� � ��������� ���������� 
// � ���� ������. ������ � ���� ����� ������ ����� �������, �������� �� ��� ������ �� ������� �������. 
// ��� ����� ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � �������� ������ ��� 
// �, �; 9455, 8997 � �������� ������ ���� �.

import java.util.Scanner;

public class Task33 {
    public static void main(String[]args) {
		
 	int pass; // �������� ����������
 			
 	  Scanner sc = new Scanner (System.in);  // �������� �������
 			    
 	System.out.println(" Password: ");
 			 
 	  pass = sc.nextInt();   // ���� PASSWORD
 	  
 	if(pass == 9583 || pass == 1747) { System.out.println(" Level Access for A,B,C  "); }
 	if(pass == 3331 || pass == 7922) { System.out.println(" Level Access for B,C  "); }
 	if(pass == 9455 || pass == 8997) { System.out.println(" Level Access for C  "); }
 	else {System.out.println(" Access Denied ");
 		
 	}
  
  
  }

}
