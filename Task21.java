package by.htp.less.branchings;

import java.util.Scanner;

//// ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻.
//   � ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� �������� ��������!�

public class Task21 {
	public static void main(String[]args) {
		
		String a;
		
		Scanner sc = new Scanner(System.in);
		  
		  System.out.print("��� ��: ������� ��� �������? ����� � ��� �: ");
		 
		   a = sc.nextLine();
		   
		   System.out.print(a);
		  
		  
		 while (!(a.equalsIgnoreCase("�") || a.equalsIgnoreCase("�"))) {
			 
			 System.out.print("\n ��� ...� �� ����� �������� �� ������ ��� �������� ");
			 
			 sc.hasNext();
		 }
		  
		 String x;
			
			x = a.toLowerCase();
			
			sc.close();
			
			
			switch(x) {
			
			case "�":
				System.out.print("\n ��� �������� �������!");
	    
				break;
				
			case "�":
				System.out.print("\n �������� �������� ��������!");
				break;
				
			
			}
		  
		
		  }

}
