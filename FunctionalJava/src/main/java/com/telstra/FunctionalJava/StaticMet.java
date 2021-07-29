package com.telstra.FunctionalJava;
interface Finder {
    public int find(String s1, String s2);
}

public class StaticMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finder finder = StaticMet::doFind;
		System.out.println(finder.find("Samrudhi", "Santaji"));

	}
	public static int doFind(String s1, String s2){
        return s1.lastIndexOf('S');
    }


}
