package org.accessspec1;

import org.accessspec.AccessSpecifier;

public class Protected extends AccessSpecifier{
protected void Movie() {
	System.out.println("rr");
}
public static void main(String[] args) {
	Protected p = new Protected();
	p.Movie();
	//p.Wheels();
	AccessSpecifier s = new AccessSpecifier();

	
}
}
