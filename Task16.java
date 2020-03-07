package by.htp.less.branchings;

import java.util.Scanner;

// На плоскости ХОY задана своими координатами точка А. 
// Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {
	public static void main(String[]args) {
		
         int x , y ; // создание переменных
		
		 Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("Пожалуйста, введите координаты точки A ниже  ");
		 
		x = sc.nextInt();   // ввод значения 1й координаты
		y = sc.nextInt();   // ввод значения 2й координаты
		
		if(x==0 && y==0) {System.out.println(" точки X и Y в начале координат  ");} // Условия
		
		else if(x==0 && y<0 || y>0) {System.out.println(" На оси Y ");}
		else if(x<0 || x>0 && y==0) {System.out.println(" На оси X ");}
		
		else if(x>0 && y>0){System.out.println("I четверть");}
		
		else if(x<0 && y>0){System.out.println("II четверть");}
		
		else if(x<0 && y<0){System.out.println("III четверть");}
		
		else {System.out.println("IV четверть");}                // вывод итогов в консоль
		
		
	}

}
