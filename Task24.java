package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу, определяющую результат гадания на ромашке — «любит—не любит»,
// взяв за исходное данное количество лепестков п.

public class Task24 {
	public static void main(String[]args) {
		
		int n; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите количество лепестков ,ниже по очереди  ");
		 
		n = sc.nextInt();   // ввод количества лепестков
		
	 
		if(n % 2 == 0) {System.out.println("\n Не любит =( ");}   // условия высчитывания  и вывод на экран
		else {System.out.println("\n Любит =) ");}
		
	}

}
