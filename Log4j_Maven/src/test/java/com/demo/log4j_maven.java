
package com.demo;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.xml.XMLLayout;

public class log4j_maven {

	static Logger log=Logger.getLogger(log4j_maven.class.getName());
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Hello");
		Layout lay=new XMLLayout();
		Appender ap1=new ConsoleAppender(lay);
		Appender ap2=new FileAppender(lay,"D:\\SeleniumTesting\\TO STORE OUTPUT FILES\\abc.txt");
		log.addAppender(ap1);
		log.addAppender(ap2);
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
}
}