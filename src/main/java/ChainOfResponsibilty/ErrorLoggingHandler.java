package ChainOfResponsibilty;

public class ErrorLoggingHandler implements LoggingHandler{


    private LoggingHandler loggingHandler;
    @Override
    public void setNextHandler(LoggingHandler loggingHandler) {
        this.loggingHandler=loggingHandler;
    }

    @Override
    public void logRequest(LoggingRequest loggingRequest) {

        if(loggingRequest.getLoggingLevel().equals(LoggingLevel.ERROR)){
            System.out.println("ERROR Logging for message "+loggingRequest.getMessage());
        }
        else{
            this.loggingHandler.logRequest(loggingRequest);
        }

    }
}
