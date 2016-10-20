package day4.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class JavaLoggerExample {
	public static void main(String[] args) throws SecurityException,
			IOException {
		Logger logger = Logger.getLogger("LOGGER");
		FileHandler fileHandler = new FileHandler("data/javaLog.log");
		fileHandler.setFormatter(new Formatter() {

			@Override
			public String format(LogRecord record) {
				return record.getLoggerName() + " - " + record.getMessage();
			}
		});
		logger.addHandler(fileHandler);
		logger.log(Level.SEVERE, "Hello Log");
	}
}
