package operater;

public class otp {
	public static void main(String[] args) {
		// Arethmatic Operators
		int A =10;
		int B =20;

		int C = A+B;
		System.out.println(C);
		
		int W= A-B;
		System.out.println(W);
		
		int R = A%B;
		System.out.println(R);
		
		int T = A/B;
		System.out.println(T);
		
		
		// Increment & Decrement
		int d = A++ + A++ + ++A + A++;
		       // 10 + 11 +  13 + 13
		       // 11   12    13   13
		    System.out.println("d="+d);
		  
		
		    //comparison operator
		    // < > = <= >=
		    // always gives boolean value
		    System.out.println(A>B);
		    System.out.println(A<B);
		    System.out.println(A=B);
		    System.out.println(A <=B);		    
            System.out.println(A != B);
            
            System.out.println("Bitwise & operators");
            System.out.println(true & true);
            System.out.println(true & false);
            System.out.println(false & true);
            System.out.println(false & false);
            
            System.out.println("Bitwise || operators");
            System.out.println(true | true);
            System.out.println(true | false);
            System.out.println(false | true);
            System.out.println(false | false);
            
            
            System.out.println("logical & operator");
            System.out.println(true && true);
            System.out.println(true && false);
            System.out.println(false && true);
            System.out.println(false && false);
            
            
            System.out.println(A=+2);
	}

	
	}
