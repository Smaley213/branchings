package by.htp.less.branchings;

import java.util.Scanner;

// Написать программу — модель анализа пожарного датчика в помещении, 
// которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.

public class Task25 {
	public static void main(String[]args) {
		
               int t; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите Температуру ниже !!! ");
		 
		t = sc.nextInt();   // ввод температуры
		
		if(t>60) {System.out.println("\n ВНИМАНИЕ, опасно высокая температура !!! "); }
		
		if(t>30 & t<60) {System.out.println("\n температура в допустимом значении !!! ");}
		
		if(t<30) {System.out.println("\n температура комфортная !!! ");}
		
	}

}
