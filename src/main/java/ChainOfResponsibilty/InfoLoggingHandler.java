package ChainOfResponsibilty;

public class InfoLoggingHandler implements LoggingHandler{
    private LoggingHandler loggingHandler;
    @Override
    public void setNextHandler(LoggingHandler loggingHandler) {
        this.loggingHandler=loggingHandler;
    }

    @Override
    public void logRequest(LoggingRequest loggingRequest) {
        if(loggingRequest.getLoggingLevel().equals(LoggingLevel.INFO)){
            System.out.println("DEBUG Logging for message "+loggingRequest.getMessage());
        }
        else{
            System.out.println("Can not log this type of Logging level !! ");
        }
    }
}
