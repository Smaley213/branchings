package by.htp.less.branchings;

// ����� max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task27 {

	public static void main(String[]args) {
		
               int a,b,c,d,m,m1,max; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println(" ����������, ������� 4 ����� ���� ! ");
		 
		a = sc.nextInt();   // ���� ���  ����� �����
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a > b) { m = b;}    // ������� ���������� ���
		else   {m = a;} 
	    
	    if(c < d) {m1 = d;}
	    else  {m1 = c;}
	    
	    if(m < m1) {max = m1;}
	    else {max = m;}
		
		 System.out.println(" ����� max = " +max); // ����� �� �����
		
	}

}
