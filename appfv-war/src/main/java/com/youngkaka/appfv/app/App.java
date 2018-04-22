package com.youngkaka.appfv.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class App {
	 public static void main( String[] args )
	    {
	    	ApplicationContext appContext = 
	    	   new ClassPathXmlApplicationContext();

	    	Resource resource = 
	           appContext.getResource("classpath:com/youngkaka/appfv/data/videos.json");
	    	
	    try{
	     	  InputStream is = resource.getInputStream();
	          BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        	
	          String line;
	          while ((line = br.readLine()) != null) {
	             System.out.println(line);
	       	  } 
	          br.close();
	        	
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	    	
	    }
}
