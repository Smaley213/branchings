package by.htp.less.branchings;

import java.util.Scanner;



// Составить программу, которая определит площадь какого круга меньше.

public class Task10 {
	public static void main(String[]args) {
		
		  int a, b , r ;  //создание переменных
		  double s1, s2;
	
		  Scanner sc = new Scanner (System.in);
		    
		    System.out.println("Пожалуйста введите Радиус 1-го круга  !!");
		 
		a = sc.nextInt();   // ввод значения  1-го круга
		
		    System.out.println("Пожалуйста введите Радиус 2-го круга  !!");
		 
	    b = sc.nextInt();   // ввод значения  2-го круга
	    
	    s1 = Math.PI *(a *2);
	    
	    s2 = Math.PI *(b *2);
	    
	     if (s1 == s2) {
	    	 System.out.println("Площади 1-го и 2-го круга равны !!");
	    	 
	     }
	     if (s1 > s2) {
	    	 System.out.println("Площадь 2-го круга меньше и = " +s2);
	    	 
	     }
	     if (s1 < s2) {
	    	 System.out.println("Площадь 1-го круга меньше и = "+s1);
	    	 
	     }
	     
	}

}
