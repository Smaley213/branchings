package by.htp.less.branchings;

// ������ ������� �, � �������������� ��������� � ������� �, �, z �������. 
// ����������, ������� �� ������ ����� ���������.

import java.util.Scanner;

public class Task31 {
       public static void main(String[]args) {
    			
    	int a,b,x,y,z; // �������� ����������
    			
    	Scanner sc = new Scanner (System.in);  // �������� �������
    			    
    	System.out.println("����������, ������� ������� ��������� ���� !!! ");
    			 
    	a = sc.nextInt();   // ���� A
    	b = sc.nextInt();   // ���� B
    	
    	System.out.println("����������, ������� ������� ������� X ,Y ,Z  ���� !!! ");
    	
    	x = sc.nextInt();
    	y = sc.nextInt();
    	z = sc.nextInt();
    	
    	if ((x<=a & y<=b)||(y<=a & x<=b)) {System.out.println("\n ������� ! "); }
    	else if ((x<=a & z<=b) || (z<=a & x<=b)) {System.out.println("\n ������� ! "); }
    	else if ((y<=a & z<=b) || (z<=a & y<=b)) {System.out.println("\n ������� ! "); }
    	else {System.out.println("\n �� �������  ! ");}
     }

}
