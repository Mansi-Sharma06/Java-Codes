package Recursion;

public class printNumber {
	
	
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
	    int num = 3;
	    print(num);
	
	   
	
	
	
	
	
//	public static void print(int n) {
//		if ( n == 0) {
//			return;
//		}
//		if(n == 1) {
//			System.out.print(n + " ");
//			return;
//		}
//		print(n - 1);
//		System.out.print(n + " ");
//	}
//	
//
//	public static void main(String[] args) {
//		
//		int n = 6;
//		print(n);
//		// TODO Auto-generated method stub

	}

}
