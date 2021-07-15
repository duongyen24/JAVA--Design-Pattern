package singleton.pattern;

public class Logger {
	
	private static Logger logger;  //create logger instance inside class
	
	private Logger() {   //set constructor to private so we can not access it by creating instance
		
	}
	
	public static Logger getInstance() {
		if( logger == null) {
			logger = new Logger();
			
		}
		return logger;
	}
	

}
