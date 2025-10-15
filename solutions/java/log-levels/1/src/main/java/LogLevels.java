public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        return logLine.substring(colonIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        return logLine.substring(start + 1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        String msg = LogLevels.message(logLine);
        String level = "(" + LogLevels.logLevel(logLine) + ")";
        return msg + " " + level;
    }
}
