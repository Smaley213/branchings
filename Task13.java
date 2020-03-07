package by.htp.less.branchings;

import java.util.Scanner;

// Даны две точки А(х1, у1) и В(х2, у2). 
// Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

public class Task13 {
      public static void main(String[]args) {
		
		int a , b, x1, x2, y1 ,y2 ; // 
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите числа точки А ниже  ");
		 
		x1 = sc.nextInt();   // ввод значения 1й точки
		y1 = sc.nextInt();
		
		System.out.println("Пожалуйста, введите числа точки В ниже  ");
		
		x2 = sc.nextInt();   // ввод значения 2й точки
		y2 = sc.nextInt(); 
		
		a = (int)Math.sqrt((x1*x1)+(y1*y1));
		
		b = (int)Math.sqrt((x2*x2)+(y2*y2));
		
		if(a>b) {System.out.println("Точка А ближе ");
		}else {System.out.println("Точка B ближе ");}
		
	}

}
