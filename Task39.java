package by.htp.less.branchings;

//

import java.util.Scanner;

public class Task39 {
	public static void main(String[]args) {
		
		int x,y; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println(" ����������, ������� �������� X (���)  ");
		 
		x = sc.nextInt();   // ���� �������� 
		

		if ( x>=8 ) { y = -(x * 2)+ x - 9 ; System.out.println("\n F(x)= "+y); } // ������� ����������
		
		else if( x <8 ) { y = 4; System.out.println("\n F(x)= "+y); }
		
	}

}
