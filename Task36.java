package by.htp.less.branchings;

// ��������� �������� �������: F(x) = x*2-3x +9 ���� x<=3  ,F(x) = (x*3 - 6) /1 ���� x>3 

import java.util.Scanner;

public class Task36 {
    public static void main(String[]args) {
		
		int x,y; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println(" ����������, ������� �������� X (���) ");
		 
		x = sc.nextInt();   // ���� ��������
		
		if(x<=3) {y = x*2-3*x +9; System.out.println("\n F(x)= "+y); }            // ������� ����������
		else if(x>3) {y = 1/((x*3) + 6); System.out.println("\n F(x)= "+y); }
		
	}

}
