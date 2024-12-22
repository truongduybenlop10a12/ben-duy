package basic.dev;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * cau 1
         */
		  Scanner sc = new Scanner (System.in);
		  int a;
		  int b;
		  
		  System.out.println("a=");
		  a = sc.nextInt ();
		  System.out.println("b=");
		  b = sc.nextInt();
		  
		  int dienTich = a * b;
		  int chuvi = (a+b)*2;
		  System.out.println("Dien tich: " + dienTich);
		  System.out.println("Chu vi:" + chuvi);
		  
		  /**
		   * Cau2
		   */
		  
		     System.out.println("n=");
		     int n = sc.nextInt();
		     if(n % 2== 0) {
		    	  System.out.println(n + "la so chan");
		     }else {
		    	 System.out.println(n+ "la so le");
		     }
		      //S 1 + 1/2 +   +1/n;
		     double tong = 0;
		     for(int i = 1;i<=n;i++) {
		    	  tong +=(double)1/i;
		     }
		     System.out.println("Tong:" + tong);
	}
	}
