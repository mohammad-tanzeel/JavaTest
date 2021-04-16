package com.HackerRank;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_ch = br.readLine().split(" ");
         char[] ch = new char[N];
         for(int i_ch = 0; i_ch < arr_ch.length; i_ch++)
         {
         	ch[i_ch] = arr_ch[i_ch].charAt(0);
         }

         String out_ = FindIt(N, ch);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String FindIt(int N, char[] ch){
       // Write your code here
       StringBuilder sbf
            = new StringBuilder("");
        sbf.append(ch);
        return sbf;
    }
}