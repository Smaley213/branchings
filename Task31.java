package by.htp.less.branchings;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
// Определить, пройдет ли кирпич через отверстие.

import java.util.Scanner;

public class Task31 {
       public static void main(String[]args) {
    			
    	int a,b,x,y,z; // создание переменных
    			
    	Scanner sc = new Scanner (System.in);  // создание сканера
    			    
    	System.out.println("Пожалуйста, введите Размеры отверстия ниже !!! ");
    			 
    	a = sc.nextInt();   // ввод A
    	b = sc.nextInt();   // ввод B
    	
    	System.out.println("Пожалуйста, введите Размеры кирпича X ,Y ,Z  ниже !!! ");
    	
    	x = sc.nextInt();
    	y = sc.nextInt();
    	z = sc.nextInt();
    	
    	if ((x<=a & y<=b)||(y<=a & x<=b)) {System.out.println("\n Пройдет ! "); }
    	else if ((x<=a & z<=b) || (z<=a & x<=b)) {System.out.println("\n Пройдет ! "); }
    	else if ((y<=a & z<=b) || (z<=a & y<=b)) {System.out.println("\n Пройдет ! "); }
    	else {System.out.println("\n Не Пройдет  ! ");}
     }

}
