package com.telstra.FunctionalJava;


interface Deserializer {
    public int deserialize(String v1);
}


public class InstMeth {

	public int convertToInt(String v1){
        return Integer.valueOf(v1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstMeth i=new InstMeth();
		Deserializer des = i::convertToInt;
		System.out.println(des.deserialize("101"));

	}

}
