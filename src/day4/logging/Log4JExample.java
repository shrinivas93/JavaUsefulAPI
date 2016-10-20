package day4.logging;

import org.apache.log4j.Logger;

public class Log4JExample {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Log4JExample.class);
		logger.debug("hello");
		logger.info("hi");
		logger.fatal("bye");
	}
}
