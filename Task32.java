package by.htp.less.branchings; 

// Написать программу, которая по заданным трем числам определяет, 
// является ли сумма каких-либо двух из них положительной.

import java.util.Scanner;

public class Task32 {
    public static void main(String[]args) {
		
 	int a,b,c; // создание переменных
 			
 	Scanner sc = new Scanner (System.in);  // создание сканера
 			    
 	System.out.println("Пожалуйста, введите значения ниже !!! ");
 			 
 	a = sc.nextInt();   // ввод с клавиатуры
 	b = sc.nextInt();
 	c = sc.nextInt();
 	
 	if(a+b >0 || b+c >0 || a+c >0) {System.out.println(" Присутствует положительная сумма ");   } // условия выполнения поиска суммы
 	else {System.out.println(" Отсутствует положительная сумма ");}
  
  
  }
}


