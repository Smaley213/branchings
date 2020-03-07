package by.htp.less.branchings;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class Task29 {

	public static void main(String[]args) {
		
               int x1,x2,x3,y1,y2,y3; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		 System.out.println("Пожалуйста, введите значения А ниже !!! ");
		 
		x1 = sc.nextInt();   // ввод A
		y1 = sc.nextInt();
		
		System.out.println("Пожалуйста, введите значения B ниже !!! ");
		
		x2 = sc.nextInt();  // ввод B
        y2 = sc.nextInt(); 
        
        System.out.println("Пожалуйста, введите значения C ниже !!! ");
        
		x3 = sc.nextInt();  // ввод C
		y3 = sc.nextInt();
		
		
		if ((x1*y2 + x3*y1) + (x2*y3 - x3*y2) - (x2*y1) - (x1*y3) == 0)  // условия выполнения // хммм...
		   {System.out.println("Лежат") ;}

		else {System.out.println("Не лежат") ;}

		//{y_2-y_1}{x_2-x_1}={y_3-y_1}{x_3-x_1}   /// мало времени ,разобраться потом 
		
	}

}
