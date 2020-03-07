package by.htp.less.branchings;

import java.util.Scanner;

// ѕерераспределить значени€ переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее

public class Task22 {
	public static void main(String[]args) {
		
		int x, y, z; // создание переменных
		
		Scanner sc = new Scanner (System.in);  // создание сканера
		    
		    System.out.println("ѕожалуйста, введите значени€ X потом Y ,ниже по очереди  ");
		 
		x = sc.nextInt();   // ввод значени€  
		y = sc.nextInt();
		
		System.out.println("\n x = "+x+"\n y = "+y+"\n «атем перераспредел€ем значени€ чтобы ’ был больше ");
		
		if( y>x ) {    // услови€ 
			
			z = x;
			x = y;
			y = z;}
		
		else if(x>y){
			x = x;
			y = y;
		}
		
		System.out.println("\n »того "+"\n x = "+x+"\n y = "+y); // вывод в консоль итога
	}

}
