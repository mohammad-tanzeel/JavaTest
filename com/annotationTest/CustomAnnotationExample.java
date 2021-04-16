package com.annotationTest;

@MyAnnotation
public class CustomAnnotationExample {

	@MyAnnotation
	private String name = "MyName"; 
	
	@MyAnnotation
	public CustomAnnotationExample() {
		
	}
	
	@MyAnnotation
	public void doit() {
		
	}
	public void printText(@MyAnnotation String text) {
		
		@MyAnnotation String localVar = "Some text";
	}
	
}
