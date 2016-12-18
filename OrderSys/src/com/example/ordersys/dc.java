package com.example.ordersys;

public class dc {
	
	public static int add(int num){	
	    num+=1;
	    return num;
	}

	public static int reduce(int num) {
		// TODO Auto-generated method stub
		if(num>0){
		num--;
		return num;
		}
		else
			return 0;
	}
}
