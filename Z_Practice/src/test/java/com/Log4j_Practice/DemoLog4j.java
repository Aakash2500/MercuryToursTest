package com.Log4j_Practice;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DemoLog4j {

	static Logger log=Logger.getLogger(DemoLog4j.class);
	
	@Test
	public void m1()
	{
		log.debug("eeeeeeeeeeee");
		log.info("aaaaaaaaaaaa");
		log.warn("bbbbbbbbbbbbbbb");
		log.error("ccccccccccccc");
		log.fatal("ddddddddddddd");

	}
}
