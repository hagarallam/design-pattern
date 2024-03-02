package ChainOfResponsibilty;

public class DebugLoggingHandler implements LoggingHandler{

    private LoggingHandler loggingHandler;
    @Override
    public void setNextHandler(LoggingHandler loggingHandler) {
        this.loggingHandler=loggingHandler;
    }

    @Override
    public void logRequest(LoggingRequest loggingRequest) {
        if(loggingRequest.getLoggingLevel().equals(LoggingLevel.DEBUG)){
            System.out.println("DEBUG Logging for message "+loggingRequest.getMessage());
        }
        else{
            this.loggingHandler.logRequest(loggingRequest);
        }
    }
}
