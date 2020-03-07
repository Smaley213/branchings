package by.htp.less.branchings;

import java.util.Scanner;

// ѕодсчитать количество отрицательных среди чисел а, b, с.

public class Task18 {
	public static void main(String[]args) {
		
		int a, b, c ,x = 0 ; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("ѕожалуйста, введите 3 числа ниже по очереди  ");
		 
		a = sc.nextInt();   // ввод значени€  
		b = sc.nextInt();    
		c = sc.nextInt();    
		
		if(a<0 & b<0 & c<0) {System.out.println("¬се числа отрицательные ");}
		else{System.out.println("есть положительные и отрицательные ");}
		
		if(a<0) {x = x+1;}
		if(b<0) {x = x+1;}
		if(c<0) {x = x+1;}
		
		System.out.println(" оличество отрицательных чисел = "+x);
		
	}

}
