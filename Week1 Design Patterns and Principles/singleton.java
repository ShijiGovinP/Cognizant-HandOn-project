public class singleton {
    public static class Logger {
        private static Logger instance;
        private Logger() {
            System.out.println("Logger initialized!");
        }
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }
        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("First log message");
        logger2.log("Second log message");
        System.out.println("logger1 == logger2 " + (logger1 == logger2));
    }
}




//OUTPUT
// Logger initialized!
// [LOG]: First log message
// [LOG]: Second log message
// logger1 == logger2 true
    

