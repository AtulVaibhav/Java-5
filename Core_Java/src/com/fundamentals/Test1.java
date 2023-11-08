package com.fundamentals;

public class Test1 {
   public void getSize(){
	   System.out.println("byte Size = "+Byte.SIZE+" bits");
	   System.out.println("short Size = "+Short.SIZE+" bits");
	   System.out.println("int Size = "+Integer.SIZE+" bits");
	   System.out.println("long Size ="+Long.SIZE+" bits");
	   System.out.println("char Size ="+Character.SIZE+" bits");
	   System.out.println("float Size ="+Float.SIZE+" bits");
	   System.out.println("double Size ="+Double.SIZE+" bits");
	   
   }
   
   public void getRange(){
	   System.out.println("byte");
	   System.out.println("Max Value :"+Byte.MAX_VALUE+" Min Value"+Byte.MIN_VALUE);
 
	   System.out.println("short");
	   System.out.println("Max Value :"+Short.MAX_VALUE+" Min Value"+Short.MIN_VALUE);
   
	   System.out.println("int");
	   System.out.println("Max Value :"+Integer.MAX_VALUE+" Min Value"+Integer.MIN_VALUE);
   
	   System.out.println("long");
	   System.out.println("Max Value :"+Long.MAX_VALUE+" Min Value"+Long.MIN_VALUE);
       
	   System.out.println("float");
	   System.out.println("Max Value :"+Float.MAX_VALUE+" Min Value"+Float.MIN_VALUE);
  
	   System.out.println("double");
	   System.out.println("Max Value :"+Double.MAX_VALUE+" Min Value"+Double.MIN_VALUE);
      
//	   System.out.println("char");
//	   System.out.println("Max Value :"+Character.MAX_VALUE+" Min Value"+Character.MIN_VALUE);
   }
   
	public static void main(String[] args) {
		Test1 t = new Test1();
		//t.getSize();
		
		t.getRange();

	}

}
