package by.htp.less.branchings;

// ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, � �������� �� ����������� ����������, ���� ��� �� ���.

import java.util.Scanner;

public class Task30 {

	public static void main(String[]args) {
		
               int a,b,c; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� a,b,c ���� !!! ");
		 
		a = sc.nextInt();   // ���� �������� 
		b = sc.nextInt();
		c = sc.nextInt();
		
		  if (a > b & b > c) {          // ������� ����������
	           a = a * 2;
	           b = b * 2;
	           c = c * 2;
	        } else {
	            a = Math.abs(a);          // ��������
	            b = Math.abs(b);
	            c = Math.abs(c);
	        }
		
		  System.out.printf(" A: "+ a+" B: "+b+" C: "+c);  // ����� � ������� 
		  
      }


	}


