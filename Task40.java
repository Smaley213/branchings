package by.htp.less.branchings;

//

import java.util.Scanner;

public class Task40 {
	public static void main(String[]args) {
		
		int x,y; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println(" ����������, ������� �������� X (���)  ");
		 
		x = sc.nextInt();   // ���� �������� 
		

		if( x<=13 ) { y = -x * 3 +9 ; System.out.println("\n F(x)= "+y); } // ������� ����������
		
		else if( x >13 ) { y = -(3/(x+1)); System.out.println("\n F(x)= "+y); }
		
		
	}

}
