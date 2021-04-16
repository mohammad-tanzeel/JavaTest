package com.annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target(ElementType.METHOD)
public @interface MyAnnotation {
	
	String name() default "jack";
	int count() default 999;
	String[] tags() default {"Java", "Annotation"};
}
