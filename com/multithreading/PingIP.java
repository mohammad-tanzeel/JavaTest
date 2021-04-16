package com.multithreading;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingIP {
	private static final int MYTHREADS = 200;
	private static ConcurrentSkipListSet<String> list = new ConcurrentSkipListSet<String>(); 
	private static String ping_file = "E:\\Tanzeel\\Java\\ProjectNew2\\TestProject\\files\\pingdata.txt";
	
	public static void main(String[] args) throws Exception {
		
		  ArrayList<String> list_host = gethosts();
		  FileWriter fw = new FileWriter(ping_file);
		  BufferedWriter bw = new BufferedWriter(fw);
		  bw.write("Host,Ping_Status,Telnet_Status\n");
		  ping(list_host,list);
		  Iterator<String> itr = list.iterator(); 
	      while (itr.hasNext()) { 
	            bw.write(itr.next()); 
	            bw.newLine();
	      } 
		  bw.close();
		  fw.close();

	}
	public static void ping(Connection conn_local,String ping_file,String queryFilePath) throws Exception { 
		  ArrayList<String> list_host = gethosts();
		  FileWriter fw = new FileWriter(ping_file);
		  BufferedWriter bw = new BufferedWriter(fw);
		  bw.write("Host,Ping_Status,Telnet_Status\n");
		  ping(list_host,list);
		  Iterator<String> itr = list.iterator(); 
	      while (itr.hasNext()) { 
	            bw.write(itr.next()); 
	            bw.newLine();
	      } 
		  bw.close();
		  fw.close();
	}
	
	public static ArrayList<String> gethosts() throws ClassNotFoundException, SQLException, IOException 
	  {  
		
		ArrayList<String> hosts = new ArrayList<String>();
	  	
	      try
	      {    
	    	  hosts.add("1.1.1.1");
	    	  hosts.add("8.8.8.8");
	    	  hosts.add("1.1.1.1");
	    	  hosts.add("1.1.1.1");
	      }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	      }
		return hosts;
	  }
	
	public static void ping(ArrayList<String> hostList,ConcurrentSkipListSet<String> list) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);

		 Iterator<String> it = hostList.iterator();
	     while(it.hasNext()) {
			String url = (String)it.next();
			executor.execute(new ProcessRunnable(url,list));
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
	}
 
	public static class ProcessRunnable implements Runnable {
		private final String url;
		private final ConcurrentSkipListSet<String> list;
		ProcessRunnable(String url,ConcurrentSkipListSet<String> list) {
			this.url = url;
			this.list = list;
		}
 
		@Override
		public void run() {
				String telnet_status = null,ping_status = null; 
				int port = 2738;			
					try {
				        InetAddress inet = InetAddress.getByName(url);
				        if (inet.isReachable(1000)){
				        	ping_status = "True";
				        } 
				        else {
				        	ping_status = "False";
				        }
					}
					catch ( Exception e ) {
						ping_status = "False";
				 	}

				    try (Socket pingSocket = new Socket(url, port)) {
				      try (PrintWriter out = new PrintWriter(pingSocket.getOutputStream(), true); BufferedReader in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));) {
				        telnet_status = "True";
				      }
				    } catch (IOException e) {
				    	telnet_status = "False";
				    }
				System.out.println(url+","+ping_status+","+telnet_status);    
				list.add(url+","+ping_status+","+telnet_status);    
		}	    
	}
}
