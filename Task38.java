package by.htp.less.branchings;

//

import java.util.Scanner;

public class Task38 {
	public static void main(String[]args) {
		
		int x,y; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println(" ����������, ������� �������� X (���)  ");
		 
		x = sc.nextInt();   // ���� �������� 
		

		if(0<=x & x<=3) { y = x * 2 ; System.out.println("\n F(x)= "+y); } // ������� ����������
		
		else if( x >3 || x<0) { y = 4; System.out.println("\n F(x)= "+y); }
		
	}

}
