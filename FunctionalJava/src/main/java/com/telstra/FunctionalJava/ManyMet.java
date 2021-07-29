package com.telstra.FunctionalJava;

import java.io.IOException;
import java.io.OutputStream;

interface MyInterface {

    void printIt(String text);

    default public void printUtf8To(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }

    static void printItToSystemOut(String text){
        System.out.println(text);
    }
}


public class ManyMet{

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//ManyMet m=new ManyMet();
		MyInterface myInterface = (String text) -> {
		    System.out.print(text);
		};
		myInterface.printIt("Samrudhi");
		//myInterface.printUtf8To("Hi", "Samrudhi");
		//m.printItToSystemOut("Hi");
		


	}

}
