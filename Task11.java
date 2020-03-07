package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу, которая определит площадь какого треугольника больше

public class Task11 {
	public static void main(String[] args ) {
		
		int a,b,c,a2,b2,c2,p,p2; //создание переменных
		double s,s2;
		
		Scanner sc = new Scanner (System.in);  // создание сканера
	    
	    System.out.println("Пожалуйста, введите значения сторон 1 треугольника поочередно ниже ");
	 
	a = sc.nextInt();   // ввод значения сторон 1 треугольника
	b = sc.nextInt(); 
	c = sc.nextInt(); 
	
	     System.out.println("Пожалуйста, введите значения сторон 2 треугольника поочередно ниже ");
	     
	a2 = sc.nextInt();   // ввод значения сторон 1 треугольника
	b2 = sc.nextInt(); 
	c2 = sc.nextInt(); 
	
	p = (a+b+c)/2;                                   // Вычисление 1-го треугольника
	s = (int)Math.sqrt(p * (p-a) * (p-b) * (p-c));
	
	p2 = (a2 + b2 + c2) /2;                                   // Вычисление 2-го треугольника
	s2 = (int)Math.sqrt(p2 * (p2-a2) * (p2-b2) * (p2-c2)); 
	
	if (s > s2) {   //----------------------------------------------------   //Условия
		
		System.out.println("Площадь 1 -го треугольника больше и = "+s);   //ВЫвод результата в консоль
		
	}if (s < s2) {

	   System.out.println("Площадь 2 -го треугольника больше и = "+s2);   //ВЫвод результата в консоль
	  }
	
		
	}

}
