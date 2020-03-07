package by.htp.less.branchings;

  // Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

public class Task07 {
	public static void main(String[]args) {
		
		  int a , b , c , x , sum ;  //создание переменных
		  
		  a = 3;   // присвоение значений к переменным
		  b = 5;
		  c = 2;
		  x = 7;
		  
		  sum = (a * x * x) + (b * x) + c;  // решение по уровнению
		   
		  System.out.println(" итог выражения = "+sum); // вывод на экран консоли
		  
	}

}
