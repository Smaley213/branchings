package by.htp.less.branchings;

import java.util.Scanner;

// �� ��������� ��Y ������ ������ ������������ ����� �. 
// �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).

public class Task16 {
	public static void main(String[]args) {
		
         int x , y ; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� ���������� ����� A ����  ");
		 
		x = sc.nextInt();   // ���� �������� 1� ����������
		y = sc.nextInt();   // ���� �������� 2� ����������
		
		if(x==0 && y==0) {System.out.println(" ����� X � Y � ������ ���������  ");} // �������
		
		else if(x==0 && y<0 || y>0) {System.out.println(" �� ��� Y ");}
		else if(x<0 || x>0 && y==0) {System.out.println(" �� ��� X ");}
		
		else if(x>0 && y>0){System.out.println("I ��������");}
		
		else if(x<0 && y>0){System.out.println("II ��������");}
		
		else if(x<0 && y<0){System.out.println("III ��������");}
		
		else {System.out.println("IV ��������");}                // ����� ������ � �������
		
		
	}

}
