package com.telstra.FunctionalJava;

interface MyFactory {
    public String create(char[] chars);
}


public class LocalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c= {'s','a','m'};
		String myString = "Test";

		MyFactory myFactory = (chars) -> {
		    return myString + ":" + new String(chars);
		};
		System.out.println(myFactory.create(c));


	}

}
