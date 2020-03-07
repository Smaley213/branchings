package by.htp.less.branchings;

import java.util.Scanner;

//  Даны два угла треугольника (в градусах). 
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task14 {
	public static void main(String[]args) {
		
		int a , b ; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите значения 2х углов в градусах ниже  ");
		 
		a = sc.nextInt();   // ввод значения 1й точки
		b = sc.nextInt();
		
		if(a+b<180) {System.out.println("Треугольник существует  ");
		}
		else { System.out.println("Треугольник  не существует ");}
		
		if(a==90 || b==90 || a+b==90) {System.out.println("Треугольник прямоугольный ");
		}
		else { System.out.println("Треугольник  не прямоугольный ");}
		
		
	}

}
