package by.htp.less.branchings;

import java.util.Scanner;

// ���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������

public class Task22 {
	public static void main(String[]args) {
		
		int x, y, z; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� �������� X ����� Y ,���� �� �������  ");
		 
		x = sc.nextInt();   // ���� ��������  
		y = sc.nextInt();
		
		System.out.println("\n x = "+x+"\n y = "+y+"\n ����� ���������������� �������� ����� � ��� ������ ");
		
		if( y>x ) {    // ������� 
			
			z = x;
			x = y;
			y = z;}
		
		else if(x>y){
			x = x;
			y = y;
		}
		
		System.out.println("\n ����� "+"\n x = "+x+"\n y = "+y); // ����� � ������� �����
	}

}
