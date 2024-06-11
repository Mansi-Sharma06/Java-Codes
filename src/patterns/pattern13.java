package patterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {

	             for (int j = 1; j <= i; j++) {

	                 System.out.print((char) (j + 64));
	             }
	             System.out.println(" ");
	         }
		
//		int i = 1;
//		while(i <= n) {
//			int j = 1;
//			while(j <= i) {
//				char ithchar = (char)('A' + i - 1);
//				System.out.print(ithchar);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}

	}

}
