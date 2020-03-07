package by.htp.less.branchings;

import java.util.Scanner;

// Определить, делителем каких чисел а, b, с является число k.

public class Task20 {
	public static void main(String[]args) {
		

		int a, b, c ,k ; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите 3 числа ниже по очереди  ");
		 
		a = sc.nextInt();   // ввод значения  
		b = sc.nextInt();    
		c = sc.nextInt();
		
		System.out.println("Пожалуйста, введите число-делитель  ");
		
		k = sc.nextInt();  // ввод значения
		
		if(a % k == 0) {System.out.println(" K является делителем a ");}    // Условия с выводом на консоль
		if(b % k == 0) {System.out.println(" K является делителем b  ");}
		if(c % k == 0) {System.out.println(" K является делителем c  ");}
		else {System.out.println(" k не является делителем каких либо чисел   ");}
		
	}

}
