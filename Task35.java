package by.htp.less.branchings;

// ��������� ����� � ����� � ������������ ���� �� ������ ���.

import java.util.Scanner;

public class Task35 {
    public static void main(String[]args) {
    	
 	int d, m=1 ,y; // �������� ����������
 			
 	Scanner sc = new Scanner (System.in);  // �������� �������
 			    
 	System.out.println(" ����������, ������� DATE (����� ���!) �� ���������� ��� (365 ���)  ");
 			 
 	d = sc.nextInt();   // ���� DATE
 	
 	if(d<0 || d>365) {System.out.println(" ������ ��� �� ���������� !  ");}
 	else {
 	
 	int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
 	
 	while (d > days[-1 + m]){
        d -= days[-1 + m++];
    }
 	System.out.println(" DATE: "+d+"\n Month: "+m);
 	
 	/*switch (sum) {                                                ��� ����������� =)
 	case 1: if(d>0 & d<=31) { System.out.println(" ������  "); }
 	case 2: if( d>0 & d<=28) { System.out.println(" �������  "); }
 	case 3: if( d>0 & d<=31) { System.out.println(" ����  "); }
 	case 4: if(d>0 & d<=30) { System.out.println(" ������  "); }
 	case 5: if( d>0 & d<=31) { System.out.println(" ���  "); }
 	case 6: if( d>0 & d<=30) { System.out.println(" ����  "); }
 	case 7: if(d>0 & d<=31) { System.out.println(" ����  "); }
 	case 8: if(d>0 & d<=31) { System.out.println(" ������  "); }
 	case 9: if( d>0 & d<=30) { System.out.println(" ��������  "); }
 	case 10: if(d>0 &  d<=31) { System.out.println(" �������  "); }
 	case 11: if( d>0 & d<=30) { System.out.println(" ������ "); }
 	case 12: if(d>0 &  d<=31) { System.out.println(" �������  "); }}
 	*/
 	}
  }

}
