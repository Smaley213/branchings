package by.htp.less.branchings;

import java.util.Scanner;

// ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). 
// ���� ������� ������������ ������, �� �������� �� ����.

public class Task23 {
        public static void main(String[]args) {
		
        	int d, m; // �������� ����������
    		
    		Scanner sc = new Scanner (System.in);  // �������� �������
    		    
    		    System.out.println("����������, ������� Date(����) � Month(�����) ,���� �� �������  ");
    		 
    		d = sc.nextInt();   // ���� �������� ��� 
    		m = sc.nextInt();   // ���� �������� ������ 
    		
    		 if (m<1 || m>12){System.out.println(" ����������, ������� ���������� �������� ������� !!! ");}   // ������� ���������
    		 else {System.out.println("\n ����� = "+m);  }
    		 
    		 if (d<1 || d>31){System.out.println(" ����������, ������� ���������� �������� ����  !!! ");}
    		 else {System.out.println("\n ���� = "+d); }                                      // ����� �� ����� ������
		
	}

}
