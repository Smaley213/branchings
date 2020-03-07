package by.htp.less.branchings;

//

import java.util.Scanner;

public class Task40 {
	public static void main(String[]args) {
		
		int x,y; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println(" Пожалуйста, введите значение X (икс)  ");
		 
		x = sc.nextInt();   // ввод значения 
		

		if( x<=13 ) { y = -x * 3 +9 ; System.out.println("\n F(x)= "+y); } // условия выполнения
		
		else if( x >13 ) { y = -(3/(x+1)); System.out.println("\n F(x)= "+y); }
		
		
	}

}
