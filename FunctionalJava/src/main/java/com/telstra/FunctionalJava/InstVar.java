package com.telstra.FunctionalJava;

interface MyEventProducer{
	void listen();
}



public class InstVar {
	static String name = "MyConsumer";
	
	public static void main(String[] args) {

    MyEventProducer eventProducer= ()->{System.out.println(name);};

    eventProducer.listen();
}
	
}

