package by.htp.less.branchings;

import java.util.Scanner;

public class Task37 {
	public static void main(String[]args) {
		
		int x,y; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println(" ����������, ������� �������� X (���)  ");
		 
		x = sc.nextInt();   // ���� �������� 
		
		if(x<=3) {y = -x * 2 + 3*x +9; System.out.println("\n F(x)= "+y); }    // ������� ����������
		else if(x>3) {y =((x*3) - 6) / 1; System.out.println("\n F(x)= "+y); }
	}
}
