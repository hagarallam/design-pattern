package ChainOfResponsibilty;

public class LoggingRequest {


    private LoggingLevel loggingLevel;
    private String message ;

    public LoggingRequest(LoggingLevel loggingLevel, String message) {
        this.loggingLevel = loggingLevel;
        this.message = message;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public String getMessage() {
        return message;
    }
}
