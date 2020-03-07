package by.htp.less.branchings;

import java.util.Scanner;

// Составить программу сравнения введенного числа а и цифры 3.
// Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».

public class Task03 {
	public static void main(String[]args) {
    	
   	 int a ,b ; // создание переменных
   	 
   	Scanner h = new Scanner(System.in);
   	
   	a = h.nextInt();      // Ввод координат  
   	
    b = 3;  // присваивание значений к переменным

   	 if (a < b) {                   // условия
   		 
   		 System.out.println("YES");
   	 }
   	 
   	 if(a > b) {
   		 
   		 System.out.println("NO");
   	 }
   	 
    }

}
