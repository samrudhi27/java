package com.telstra.FunctionalJava;

@FunctionalInterface
interface StringConcat{
	public String concat(String s1,String s2);
}

public class DemoLambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcat s=(s1,s2)->{ return s1+" "+s2;};
		System.out.println(s.concat("Lambda", "Expressions"));

	}

}
