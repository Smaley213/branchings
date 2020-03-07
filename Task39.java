package by.htp.less.branchings;

//

import java.util.Scanner;

public class Task39 {
	public static void main(String[]args) {
		
		int x,y; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println(" Пожалуйста, введите значение X (икс)  ");
		 
		x = sc.nextInt();   // ввод значения 
		

		if ( x>=8 ) { y = -(x * 2)+ x - 9 ; System.out.println("\n F(x)= "+y); } // условия выполнения
		
		else if( x <8 ) { y = 4; System.out.println("\n F(x)= "+y); }
		
	}

}
