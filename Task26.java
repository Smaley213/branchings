package by.htp.less.branchings;

import java.util.Scanner;

// �������� ��������� ���������� ����� �������� � �������� �� ���� �����.

public class Task26 {
	public static void main(String[]args) {
		
		 System.out.println(" H��������� ����� �������� � �������� �� ���� ����� !!! ");
		
        int a,b,c; // �������� ����������
        int sum;
	
	Scanner sc = new Scanner (System.in);  // �������� �������
	    
	    System.out.println("\n ����������, ������� ����� ���� !!! ");
	 
	a = sc.nextInt();   // ���� �����
	b = sc.nextInt();   
	c = sc.nextInt();  
	
	int max;
    int min;
    if(a>=b){
        if(b>=c){
            max=a;
            min=c;
        }else{
            if(a>=c){
                max=a;
            }else{
                max=c;
            }
            min = b;
        }
    }else{
        if(b>=c){
            if(a>=c){
                min=c;
            }else{
                min=a;
            }
            max=b;
        }else{
            max=c;
            min=a;
        }
    }
    
    sum = min+max;
    System.out.println("����� �����: "+sum);
	
	}
	

}
