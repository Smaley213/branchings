package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Task08 {
	public static void main(String[]args) {
		
		  int a, b ,s1 ,s2 ;  //создание переменных
			
			  Scanner s = new Scanner (System.in);
			    
			    System.out.println("Пожалуйста введите число А  !!");
			 
			a = s.nextInt();   // ввод значения А
			
			    System.out.println("Пожалуйста введите число B  !!");
			
			b = s.nextInt();   // ввод значения В
			 
			 s1 = a*2;       // решения задачи 
			 s2 = b*2;
			 
			 if (s1 < s2){
				 System.out.println("Сумма числа А в квадрате , наименьее "); // вывод на Экран
			 }
			 if (s1 > s2){
				 System.out.println("Сумма числа B в квадрате , наименьее "); // вывод на Экран
			 }
			
		}

}
