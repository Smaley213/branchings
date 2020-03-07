package by.htp.less.branchings;

  // ƒаны три числа a, b, с. ќпределить, какое из них равно d. ≈сли ни одно не равно d, то найти max(d Ч a, d Ч b, d Чc).

import java.util.Scanner;

public class Task28 {

	public static void main(String[]args) {
		
               int a,b,c,d,x,y,z; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("ѕожалуйста, введите «начени€ A,B,C,D ниже! ");
		 
		a = sc.nextInt();   // ввод c клавиатуры ,вносим числа 
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		
		if(a==d) {System.out.println(" A = D");  } // 1е условие
		else if (b==d) {System.out.println(" B = D"); }
		else if (c==d) {System.out.println(" C = D"); }
		
		
		
		else {System.out.println("\n A,B,C не равны D  "+"\n далее вычисл€ем max (d Ч a, d Ч b, d Чc)" );  // если ни какое не равно D то идем далее
		
		x = d-a;                               // вычисл€ем мах
		y = d-b;
		z = d-c;
		
		if(x>y || x>z) {System.out.println(" max = "+x); }   // 2е условие
		else if(y>x || y>z) {System.out.println(" max = "+y); }
		
		else {System.out.println(" max = "+z);} }   // в ином случае ,это в консоль выводим
		
		//if(a>b  & a>c  & a>d ) {System.out.println("\n max A  "+a);} //// это на вс€кий пожарный инфа
		//if(b>a  & b>c  & b>d ) {System.out.println("\n max B  "+b);}
		//if(d>a  & d>b  & d>c ) {System.out.println("\n max C  "+c);}
		
	}

}
