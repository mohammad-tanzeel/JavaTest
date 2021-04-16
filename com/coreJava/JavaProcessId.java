package com.coreJava;

import java.lang.management.ManagementFactory;

public class JavaProcessId {
	 
    public static void main(String[] args) {
        String vmName = ManagementFactory.getRuntimeMXBean().getName();
        int p = vmName.indexOf("@");
        String pid = vmName.substring(0, p);
        System.out.println(pid);
    }
}