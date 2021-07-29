package com.telstra.FunctionalJava;

@FunctionalInterface
interface FunctionalInterfaceEx{
	public String saySomething();
}

public class DemoLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceEx f= ()-> {return "Hi Lambda";};
		System.out.println(f.saySomething());

	}

}
