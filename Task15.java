package by.htp.less.branchings;

import java.util.Scanner;

// ���� �������������� ����� � � �, �� ������ ���� �����.
// ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������

public class Task15 {
	public static void main(String[]args) {
		
		int a, b , x , y; //�������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
	    
	    System.out.println("����������, ������� �������� X ,Y �� ������ ���� ����� ,����!  ");
	 
	x = sc.nextInt();   // ���� �������� 
	y = sc.nextInt();
	
	a = (x+y) /2;
	b = 2 * x * y;
	
	if(x<y) {
		x = a;
		y = b;
	}else { 
		x = b;
		y = a;
	}
	System.out.println(" X = "+x+ "\n Y ="+y);
		
	}

}
