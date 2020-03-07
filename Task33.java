package by.htp.less.branchings;

// Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации 
// в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
// Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз 
// В, С; 9455, 8997 — доступен модуль базы С.

import java.util.Scanner;

public class Task33 {
    public static void main(String[]args) {
		
 	int pass; // создание переменных
 			
 	  Scanner sc = new Scanner (System.in);  // создание сканера
 			    
 	System.out.println(" Password: ");
 			 
 	  pass = sc.nextInt();   // ввод PASSWORD
 	  
 	if(pass == 9583 || pass == 1747) { System.out.println(" Level Access for A,B,C  "); }
 	if(pass == 3331 || pass == 7922) { System.out.println(" Level Access for B,C  "); }
 	if(pass == 9455 || pass == 8997) { System.out.println(" Level Access for C  "); }
 	else {System.out.println(" Access Denied ");
 		
 	}
  
  
  }

}
