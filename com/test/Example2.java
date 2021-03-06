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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
  public static void main(final String[] args) {
    final List<Student> students = new ArrayList<Student>();
    students.add(new Student("Albert Attard", 65));
    students.add(new Student("Mary Borg", 93));
    students.add(new Student("Joe Vella", 47));
    students.add(new Student("Paul Galea", 52));
    

    Collections.sort(students);
    System.out.println(students);
  }
}
