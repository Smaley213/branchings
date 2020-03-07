package by.htp.less.branchings;

// Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task27 {

	public static void main(String[]args) {
		
               int a,b,c,d,m,m1,max; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println(" Пожалуйста, введите 4 числа ниже ! ");
		 
		a = sc.nextInt();   // поля для  ввода чисел
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a > b) { m = b;}    // условия вычисления МАХ
		else   {m = a;} 
	    
	    if(c < d) {m1 = d;}
	    else  {m1 = c;}
	    
	    if(m < m1) {max = m1;}
	    else {max = m;}
		
		 System.out.println(" ИТОГО max = " +max); // вывод на экран
		
	}

}
