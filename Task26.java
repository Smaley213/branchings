package by.htp.less.branchings;

import java.util.Scanner;

// Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {
	public static void main(String[]args) {
		
		 System.out.println(" Hахождения суммы большего и меньшего из трех чисел !!! ");
		
        int a,b,c; // создание переменных
        int sum;
	
	Scanner sc = new Scanner (System.in);  // создание сканера
	    
	    System.out.println("\n Пожалуйста, введите числа ниже !!! ");
	 
	a = sc.nextInt();   // ввод чисел
	b = sc.nextInt();   
	c = sc.nextInt();  
	
	int max;
    int min;
    if(a>=b){
        if(b>=c){
            max=a;
            min=c;
        }else{
            if(a>=c){
                max=a;
            }else{
                max=c;
            }
            min = b;
        }
    }else{
        if(b>=c){
            if(a>=c){
                min=c;
            }else{
                min=a;
            }
            max=b;
        }else{
            max=c;
            min=a;
        }
    }
    
    sum = min+max;
    System.out.println("Сумма равна: "+sum);
	
	}
	

}
