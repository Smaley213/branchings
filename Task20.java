package by.htp.less.branchings;

import java.util.Scanner;

// ����������, ��������� ����� ����� �, b, � �������� ����� k.

public class Task20 {
	public static void main(String[]args) {
		

		int a, b, c ,k ; // �������� ����������
		
		 Scanner sc = new Scanner (System.in);  // �������� �������
		    
		    System.out.println("����������, ������� 3 ����� ���� �� �������  ");
		 
		a = sc.nextInt();   // ���� ��������  
		b = sc.nextInt();    
		c = sc.nextInt();
		
		System.out.println("����������, ������� �����-��������  ");
		
		k = sc.nextInt();  // ���� ��������
		
		if(a % k == 0) {System.out.println(" K �������� ��������� a ");}    // ������� � ������� �� �������
		if(b % k == 0) {System.out.println(" K �������� ��������� b  ");}
		if(c % k == 0) {System.out.println(" K �������� ��������� c  ");}
		else {System.out.println(" k �� �������� ��������� ����� ���� �����   ");}
		
	}

}
