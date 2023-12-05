package com.radomnumbergenerator;

public class MyStaticModifier {
	private static int data;
	private static int mydata;
	public static int getData() {
		return data;
	}
	public static void setData(int data) {
		MyStaticModifier.data = data;
	}
	public static int getMydata() {
		return mydata;
	}
	public static void setMydata(int mydata) {
		MyStaticModifier.mydata = mydata;
	}
	

}
