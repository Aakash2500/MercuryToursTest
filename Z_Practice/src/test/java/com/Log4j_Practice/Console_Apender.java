package com.Log4j_Practice;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.testng.annotations.Test;

public class Console_Apender {

	static Logger log=Logger.getLogger(Console_Apender.class);
	@Test
	public void m1()
	{
		Layout l=new SimpleLayout();
		
		Appender ap=new ConsoleAppender(l);
		log.addAppender(ap);
		log.info("hiii");
		
		log.warn("helooo");
	}
	
	@Test
	public void m2() throws IOException
	{
		Layout l=new PatternLayout();
		
		Appender ap=new FileAppender(l, "ak.txt");
		
		log.addAppender(ap);
		
		log.debug("wlcomeeeeeeeee");
		log.info("akshhhhhhhhhh");
		log.warn("hiiiiiii");
		
	}
	
	@Test
	public void m3()
	{
		log.info("aaaaaaaaaaaa");
		log.warn("bbbbbbbbbbbbbbb");
		log.error("ccccccccccccc");
		log.fatal("ddddddddddddd");
		
		
	}
	
	@Test
	public void m4()
	{
		log.info("check updatted");
		
	}
}
