package com.multithreading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
//import java.sql.Connection;
import java.util.stream.Collectors;

public class CountFactors {
               private static final int MYTHREADS = 5;

               public static HashMap<String, Integer> count_map(String[] factors,String reportsDir) throws Exception {
                              ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
                              HashMap<String, Integer> map = new LinkedHashMap<>(); 
               for(String f:factors) {
//                              Callable<Object> worker = new CountRunnable(f,reportsDir);
                              Future<Object> result  = executor.submit(new CountRunnable(f,reportsDir));
                              
//                              System.out.println("Test");
                              
                              int count = (int) result.get();                  
                              System.out.println(" count "+count);
                              String feild = f.toUpperCase();
                              map.put(feild, count);
               }

//                  executor.shutdown();
//                  while (!executor.isTerminated()) {
//                  }
                  return map;
               }              
               
               public static class CountRunnable implements Callable<Object> {
//                              private  String c;
                              private  String f;
                              private  String reportsDir;
                              public int count;
                              CountRunnable(String f,String reportsDir) {
                                             this.f = f;
                                             this.reportsDir = reportsDir+f+".log";
                              }
                              public Object call() throws IOException {
                            	  System.out.println(Thread.currentThread().getName() + ": ");
                                             return count = countrecords(reportsDir);                                             
                              }
               }
               
               public static int countrecords(String filename) throws IOException {
                                             FileInputStream stream = new FileInputStream(filename);
                                             byte[] buffer = new byte[8192];
                                             int count = 0;
                                             int n;
                                             while ((n = stream.read(buffer)) > 0) {
                                                 for (int i = 0; i < n; i++) {
                                                     if (buffer[i] == '\n') count++;
                                                 }
                                             }
                                             stream.close();
                                             if(count==0)
                                                            count=0;
                                             else
                                                            count -=1;
                                             return count;
                              }
               
                public static void count(String[] factors, String reportsDir) throws Exception {
                			System.out.println(factors);
                			System.out.println(reportsDir);
                              HashMap<String, Integer> map = CountFactors.count_map(factors,reportsDir);
                              ArrayList<Integer> list1 = new ArrayList<Integer>(map.values());
                              String s1 = list1.stream().map(Object::toString).collect(Collectors.joining(","));
//                              UploadData.insert_count(conn_local,s1,date_of_run,table);
               }             
                
                public static void main(String args[]) {
                	String[] factors = {"f1", "f2", "f3", "f4","f5", "f6", "f7", "f8"};
                	String reportsDir = "E:\\Tanzeel\\Java\\ProjectNew2\\TestProject\\log\\";
                	try {
						count(factors, reportsDir);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
        
}
