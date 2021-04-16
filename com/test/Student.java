/*
 * #%L
 * Comparing the Performance of some List Implementations
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.test;

public class Student implements Comparable<Student> {

  private int grade;
  private String name;
  private int age;
  
  public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Student(final String name, final int grade) {
    setName(name);
    setGrade(grade);
  }

//  @Override
//  public int compareTo(final Student o) {
//    return Integer.compare(grade, o.grade);
//  }

  @Override
  public int compareTo(final Student o) {
    return Integer.compare(age, o.age);
  }

  public int getGrade() {
    return grade;
  }

  public String getName() {
    return name;
  }

  public void setGrade(final int grade) {
    this.grade = grade;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + " " + grade;
  }

}
