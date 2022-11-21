package org.modi;

public class AccessModifier {
	 
	public static void test1() {
		final int i=10;
       // i = 0;
	    	
		System.out.println(i);

	}//public void test2() {
		//System.out.println(i);

	//}
	public static void main(String[] args) {
		AccessModifier.test1();
		//AccessModifier a = new AccessModifier();
		//a.test2();
	}
	

}
