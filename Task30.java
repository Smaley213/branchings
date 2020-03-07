package by.htp.less.branchings;

// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.

import java.util.Scanner;

public class Task30 {

	public static void main(String[]args) {
		
               int a,b,c; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите a,b,c ниже !!! ");
		 
		a = sc.nextInt();   // ввод значений 
		b = sc.nextInt();
		c = sc.nextInt();
		
		  if (a > b & b > c) {          // условие выполнения
	           a = a * 2;
	           b = b * 2;
	           c = c * 2;
	        } else {
	            a = Math.abs(a);          // Абсолюты
	            b = Math.abs(b);
	            c = Math.abs(c);
	        }
		
		  System.out.printf(" A: "+ a+" B: "+b+" C: "+c);  // вывод в консоль 
		  
      }


	}


