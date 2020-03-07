package by.htp.less.branchings;

import java.util.Scanner;

// ƒаны целые числа m, n.
// ≈сли числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных,
// а если равны, то заменить числа нул€ми.

public class Task17 {
	public static void main(String[]args) {
		
		int n , m ,a; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("ѕожалуйста, введите числа ниже  ");
		 
		m = sc.nextInt();   // ввод значени€ 1й 
		n = sc.nextInt();   // ввод значени€ 2й 
		
		if(m == n) {
			
		m = 0;
		n = 0;
			System.out.println(" числа равны  ");}   // 1 е условие
		else { System.out.println(" числа не равны  ");}
		
		if(m >n) { a = m;}                                 // 2 е условие
		else {a = n;}
		 
		m = a;
		n = a;
			System.out.println("итоги чисел "+"\n M = "+m+"\n N = "+n); // вывод в консоль
			
	}

}
