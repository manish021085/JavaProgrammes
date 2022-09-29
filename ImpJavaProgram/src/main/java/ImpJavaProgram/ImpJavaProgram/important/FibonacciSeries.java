package ImpJavaProgram.ImpJavaProgram.important;

public class FibonacciSeries {
	
	/**
	 * In fibonacci series, next number is the sum of previous two numbers 
	 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
	 * The first two numbers of fibonacci series are 0 and 1.In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
	 */
	public static void main(String[] args) {
		
		int n1 =0, n2 =1, n3, i, count=10;
		//printing 0,1
		System.out.print(n1 + " " + n2);
		//loop starts from 2 because 0 and 1 are already printed 
		for(i=2; i<count; i++) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(" "+ n3);
			
		}

	}

}



//public static void reverseString(int num){
//    int n1 =0;
//    int n2 =1;
//    int n3;
//    System.out.print(n1 + " " + n2);
//    for(int i=2; i<num; i++){
//        n3 = n1 +n2;
//        n1 = n2;
//        n2 = n3;
//        System.out.print(" "+ n3);
//    }
//    
//}
