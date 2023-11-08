package com.fundamentals;
//Operators
public class Test10 {
    //arithmetic Operators
	public void arithmeticOperators(){
		int a = 10;
		int b = 7;
		System.out.println("Add "+(a+b));
		System.out.println("Sub "+(a-b));
		System.out.println("mul "+(a*b));
		System.out.println("Division "+a/b);
		System.out.println("Modulus "+(a%b));
	}
	
	public void relationalOperators(){
		int a = 20;
		int b = 25;
		System.out.println("Greater than"+(a>b));
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	public void unaryOperators(){
		// ++(increment),--(decrement)
		
		//post increment
		int a = 12;
		int b = a++;
		/*
		 * assign value of a to b
		 * b = a
		 * after assigning,increment value of a by 1
		 * 
		 */
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		
		//pre-increment
		int c = 20;
		int d = ++c;
		/*
		 * increment value of c by 1
		 * c = c+1
		 * assign value of c to d
		 * d = c;
		 * 
		 */
		System.out.println("Value of c :"+c);
		System.out.println("Value of d :"+d);
		
		int x = 10;
		int y = x--;
		System.out.println("Value of x :"+x);
		System.out.println("Value of y :"+y);
		
		int m = 10;
		int n= --m;
		System.out.println("Value of m :"+m);
		System.out.println("Value of n :"+n);
		
	}
	
	public void ternaryOperator(){
		// condition ? stat1 : stat2
		int a = 10;
		int b = 20;
		String result = (a>b)?"Hello":"Hi";
		System.out.println(result);
	}
	public void shift(){
		//left-shift(<<)*2  ,right-shift(>>)/2
		
		int num = 8;// 1 0 0 0
		            //1 0 0 0 0 
		num = num<<1;
		System.out.println(num);
		
		int num2 = 10;//  1 0 1 0
                      //1 0 1 0 0 
        num2 = num2<<1;
        System.out.println(num2);
        
        
        //right shift
        int num3 = 10;// 1 0 1 0
                      //  0 1 0 1
        System.out.println(num3>>1);
		
		
	}
	public void bitwiseOperator(){
		//&(bitwise AND)
		//|(bitwise OR)
		//^ (XOR)
		
		int n1 = 10;// 1 0 1 0
		int n2 = 5; // 0 1 0 1
		System.out.println(n1 & n2);
		
		System.out.println(n1 | n2);
		
		int x1 = 11;//  1 0 1 1
		int x2 = 12;//  1 1 0 0
		System.out.println(x1^x2);
		
		
	}
	
	
	public static void main(String[] args) {
		Test10 t = new Test10();
		t.arithmeticOperators();
		
		System.out.println("______________________");
		t.relationalOperators();
		
		System.out.println("______________________");
		t.unaryOperators();
		
		System.out.println("______________________");
		t.ternaryOperator();
		
		System.out.println("______________________");
		t.shift();
		
		System.out.println("______________________");
		t.bitwiseOperator();

	}

}
