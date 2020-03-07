package by.htp.less.branchings;

import java.util.Scanner;

//// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
//   В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!»

public class Task21 {
	public static void main(String[]args) {
		
		String a;
		
		Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Кто ты: мальчик или девочка? Введи Д или М: ");
		 
		   a = sc.nextLine();
		   
		   System.out.print(a);
		  
		  
		 while (!(a.equalsIgnoreCase("д") || a.equalsIgnoreCase("м"))) {
			 
			 System.out.print("\n хмм ...я не очень отношусь ко всяким там странным ");
			 
			 sc.hasNext();
		 }
		  
		 String x;
			
			x = a.toLowerCase();
			
			sc.close();
			
			
			switch(x) {
			
			case "д":
				System.out.print("\n Мне нравятся девочки!");
	    
				break;
				
			case "м":
				System.out.print("\n Девочкам нравятся Мальчики!");
				break;
				
			
			}
		  
		
		  }

}
