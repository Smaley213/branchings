package by.htp.less.branchings;

// Вычислить число и месяц в невисокосном году по номеру дня.

import java.util.Scanner;

public class Task35 {
    public static void main(String[]args) {
    	
 	int d, m=1 ,y; // создание переменных
 			
 	Scanner sc = new Scanner (System.in);  // создание сканера
 			    
 	System.out.println(" Пожалуйста, введите DATE (Номер дня!) не высокосный год (365 мах)  ");
 			 
 	d = sc.nextInt();   // ввод DATE
 	
 	if(d<0 || d>365) {System.out.println(" Такого дня не существует !  ");}
 	else {
 	
 	int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
 	
 	while (d > days[-1 + m]){
        d -= days[-1 + m++];
    }
 	System.out.println(" DATE: "+d+"\n Month: "+m);
 	
 	/*switch (sum) {                                                Для размышления =)
 	case 1: if(d>0 & d<=31) { System.out.println(" январь  "); }
 	case 2: if( d>0 & d<=28) { System.out.println(" февраль  "); }
 	case 3: if( d>0 & d<=31) { System.out.println(" март  "); }
 	case 4: if(d>0 & d<=30) { System.out.println(" апрель  "); }
 	case 5: if( d>0 & d<=31) { System.out.println(" май  "); }
 	case 6: if( d>0 & d<=30) { System.out.println(" июнь  "); }
 	case 7: if(d>0 & d<=31) { System.out.println(" июль  "); }
 	case 8: if(d>0 & d<=31) { System.out.println(" август  "); }
 	case 9: if( d>0 & d<=30) { System.out.println(" сентябрь  "); }
 	case 10: if(d>0 &  d<=31) { System.out.println(" октябрь  "); }
 	case 11: if( d>0 & d<=30) { System.out.println(" ноябрь "); }
 	case 12: if(d>0 &  d<=31) { System.out.println(" декабрь  "); }}
 	*/
 	}
  }

}
