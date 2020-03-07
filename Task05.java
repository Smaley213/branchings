package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу: определения наименьшего из двух чисел а и b.

public class Task05 {
	public static void main(String[]args) {
		
	  int a, b ;  //создание переменных
		
		  Scanner s = new Scanner (System.in);
		    
		    System.out.println("Пожалуйста введите число А  !!");
		 
		a = s.nextInt();   // ввод значения А
		
		    System.out.println("Пожалуйста введите число B  !!");
		
		b = s.nextInt();   // ввод значения В
		 
		   if (a<b) {                                    // УСЛОВИЯ СРАВНЕНИЯ
			
			  System.out.println("A меньшее чем B ");
		}
		
            if (a>b) {
			
			  System.out.println("\n A Больше чем B ");
		}
		
	}

}
