package by.htp.less.branchings;

// Вычислить значение функции: F(x) = x*2-3x +9 если x<=3  ,F(x) = (x*3 - 6) /1 если x>3 

import java.util.Scanner;

public class Task36 {
    public static void main(String[]args) {
		
		int x,y; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println(" Пожалуйста, введите значение X (икс) ");
		 
		x = sc.nextInt();   // ввод значения
		
		if(x<=3) {y = x*2-3*x +9; System.out.println("\n F(x)= "+y); }            // условия выполнения
		else if(x>3) {y = 1/((x*3) + 6); System.out.println("\n F(x)= "+y); }
		
	}

}
