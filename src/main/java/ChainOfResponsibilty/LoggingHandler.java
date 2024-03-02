package ChainOfResponsibilty;

public interface LoggingHandler {

    void setNextHandler(LoggingHandler loggingHandler);

    void logRequest(LoggingRequest loggingRequest);
}
