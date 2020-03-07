package by.htp.less.branchings;

import java.util.Scanner;

// Даны три действительных числа. 
// Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

public class Task12 {
	public static void main(String[]args) {
		
		int n1 ,n2 ,n3 , n4, n5, n6;
		
      Scanner sc = new Scanner (System.in);  // создание сканера
	    
	    System.out.println("Пожалуйста, введите числа по очередно ниже ");
	 
	n1 = sc.nextInt();   // ввод значения сторон 1 треугольника
	n2 = sc.nextInt(); 
	n3 = sc.nextInt(); 
	
	
	System.out.println("Вы ввели 3 числа "+n1+n2+n3);
	
	if ( n1 >=0) {                             // узнаем про 1 е число
		n4 = (int)Math.pow(n1, 2);                            // возводим в степень
		System.out.println("число "+n1+" в степень 2 = "+n4);}
	
		else { n4 = (int)Math.pow(n1, 4);                     // возводим в степень
		System.out.println("число "+n1+" в степень 4 = "+n4);}
		
	if ( n2 >=0) {                            // узнаем про 2 е число
		n5 = (int)Math.pow(n2, 2);
		System.out.println("число "+n2+" в степень 2 = "+n5);}
	
		else { n5 = (int)Math.pow(n2, 4);                     // возводим в степень
		System.out.println("число "+n2+" в степень 4  = "+n5);}
	
	if ( n3 >=0) {                            // узнаем про 3 е число
		n6 = (int)Math.pow(n3, 2);
		System.out.println("число "+n3+" в степень 2 = "+n6);}
	
		else { n6 = (int)Math.pow(n3, 4);                     // возводим в степень
		System.out.println("число "+n3+" в степень 4 = "+n6);}
	
	}

	
}
