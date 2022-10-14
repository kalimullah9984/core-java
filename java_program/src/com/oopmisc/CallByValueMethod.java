package com.oopmisc;

public class CallByValueMethod {
int data=50;
void change(CallByValueMethod cv) {
	cv.data=cv.data+150;
}
	public static void main(String[] args) {
		CallByValueMethod cv=new CallByValueMethod();
		System.out.println("before change:"+cv.data);
		cv.change(cv);
		System.out.println("after change:"+cv.data);
		
	}

}
