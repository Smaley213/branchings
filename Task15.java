package by.htp.less.branchings;

import java.util.Scanner;

// Даны действительные числа х и у, не равные друг другу.
// Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением

public class Task15 {
	public static void main(String[]args) {
		
		int a, b , x , y; //Создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
	    
	    System.out.println("Пожалуйста, введите значения X ,Y не равные друг другу ,ниже!  ");
	 
	x = sc.nextInt();   // ввод значения 
	y = sc.nextInt();
	
	a = (x+y) /2;
	b = 2 * x * y;
	
	if(x<y) {
		x = a;
		y = b;
	}else { 
		x = b;
		y = a;
	}
	System.out.println(" X = "+x+ "\n Y ="+y);
		
	}

}
