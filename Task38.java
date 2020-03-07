package by.htp.less.branchings;

//

import java.util.Scanner;

public class Task38 {
	public static void main(String[]args) {
		
		int x,y; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println(" Пожалуйста, введите значение X (икс)  ");
		 
		x = sc.nextInt();   // ввод значения 
		

		if(0<=x & x<=3) { y = x * 2 ; System.out.println("\n F(x)= "+y); } // условия выполнения
		
		else if( x >3 || x<0) { y = 4; System.out.println("\n F(x)= "+y); }
		
	}

}
