package by.htp.less.branchings;

  // ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d �c).

import java.util.Scanner;

public class Task28 {

	public static void main(String[]args) {
		
               int a,b,c,d,x,y,z; // �������� ����������
		
		Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� �������� A,B,C,D ����! ");
		 
		a = sc.nextInt();   // ���� c ���������� ,������ ����� 
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		
		if(a==d) {System.out.println(" A = D");  } // 1� �������
		else if (b==d) {System.out.println(" B = D"); }
		else if (c==d) {System.out.println(" C = D"); }
		
		
		
		else {System.out.println("\n A,B,C �� ����� D  "+"\n ����� ��������� max (d � a, d � b, d �c)" );  // ���� �� ����� �� ����� D �� ���� �����
		
		x = d-a;                               // ��������� ���
		y = d-b;
		z = d-c;
		
		if(x>y || x>z) {System.out.println(" max = "+x); }   // 2� �������
		else if(y>x || y>z) {System.out.println(" max = "+y); }
		
		else {System.out.println(" max = "+z);} }   // � ���� ������ ,��� � ������� �������
		
		//if(a>b  & a>c  & a>d ) {System.out.println("\n max A  "+a);} //// ��� �� ������ �������� ����
		//if(b>a  & b>c  & b>d ) {System.out.println("\n max B  "+b);}
		//if(d>a  & d>b  & d>c ) {System.out.println("\n max C  "+c);}
		
	}

}
