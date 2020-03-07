package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу: равны ли два числа а и b?

public class Task04 {
	public static void main(String[]args) {
    	
	   	 int a ,b ; // создание переменных
	   	 
	   	System.out.println("Пожалуйста введите ниже сравниваемые числа по очередно !!");
	   	 
	   	Scanner h = new Scanner(System.in);
	   	
	   	a = h.nextInt();      // Ввод координат  
	   	
	    b = h.nextInt();

	   	 if (a == b) {                   // условия
	   		 
	   		 System.out.println("YES");
	   	 }
	   	 
	   	   if(a > b) {
	   		 
	   		 System.out.println("NO");
	   	 }
	   	   if(a < b) {
	   		 
	   		 System.out.println("NO");
	   	 }
	   	 
	   	 
	}

}
