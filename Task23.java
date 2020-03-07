package by.htp.less.branchings;

import java.util.Scanner;

// ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12). 
// ≈сли введены некорректные данные, то сообщить об этом.

public class Task23 {
        public static void main(String[]args) {
		
        	int d, m; // создание переменных
    		
    		Scanner sc = new Scanner (System.in);  // создание сканера
    		    
    		    System.out.println("ѕожалуйста, введите Date(день) и Month(ћес€ц) ,ниже по очереди  ");
    		 
    		d = sc.nextInt();   // ввод значени€ дн€ 
    		m = sc.nextInt();   // ввод значени€ мес€ца 
    		
    		 if (m<1 || m>12){System.out.println(" ѕожалуйста, введите корректные значени€ мес€цам !!! ");}   // услови€ сравнени€
    		 else {System.out.println("\n ћес€ц = "+m);  }
    		 
    		 if (d<1 || d>31){System.out.println(" ѕожалуйста, введите корректные значени€ дн€м  !!! ");}
    		 else {System.out.println("\n ƒень = "+d); }                                      // вывод на экран итогов
		
	}

}
