package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

public class Task09 {
	
	public static void main(String[]args) {
		
		  int a, b , c ;  //создание переменных
			
			  Scanner s = new Scanner (System.in);
			    
			    System.out.println("Пожалуйста введите сумму стороны А  !!");
			 
			a = s.nextInt();   // ввод значения А
			
			    System.out.println("Пожалуйста введите сумму стороны  B  !!");
			
			b = s.nextInt();   // ввод значения В
			 
                System.out.println("Пожалуйста введите сумму стороны  C  !!");
			
			c = s.nextInt();   // ввод значения C
			
			 if (a < b || b > c || b < c){
				 System.out.println("треугольник не равнесторонний "); // вывод на Экран
				 }
			 
			 if (a == b && b ==c ){
				
				 System.out.println(" Ура ,треугольник  равнесторонний "); // вывод на Экран
			 }
			 
	   }
	

}
