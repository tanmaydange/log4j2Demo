package com.dange.tanmay.log4j2Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger Log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	Log.debug("Inside main");	
        Log.info("Hello World!");
        int x=10;
        Log.info("Variable value is {}",x);
    }
}
