package by.htp.less.branchings;

import java.util.Scanner;

// ��������� ��������� ��������� ���������� ����� � � ����� 3.
// ������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.

public class Task03 {
	public static void main(String[]args) {
    	
   	 int a ,b ; // �������� ����������
   	 
   	Scanner h = new Scanner(System.in);
   	
   	a = h.nextInt();      // ���� ���������  
   	
    b = 3;  // ������������ �������� � ����������

   	 if (a < b) {                   // �������
   		 
   		 System.out.println("YES");
   	 }
   	 
   	 if(a > b) {
   		 
   		 System.out.println("NO");
   	 }
   	 
    }

}
