package com.java8;

public class LambdaExpression {
	
	public static void main(String[] args) {
	
//		AnonymousCls obj = new AnonymousCls() {
//			
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("Anonymous class test");
//			}
//			
//			public void printNum(int x) {
//				System.out.println(x);
//			}
//		};
//		obj.show();
//		obj.printNum(44);
		
		AnonymousCls obj = () ->{
				// TODO Auto-generated method stub
				System.out.println("Anonymous class test");
			};
			
			obj.show();
//		};
	}
	
}

