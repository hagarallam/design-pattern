package ChainOfResponsibilty;

public class LoggingChainService {

    private LoggingHandler loggingHandler;


    public LoggingChainService() {
        this.loggingHandler= new ErrorLoggingHandler();
        LoggingHandler debugLoggingHandler = new DebugLoggingHandler();
        LoggingHandler infoLoggingHelper = new InfoLoggingHandler();
        this.loggingHandler.setNextHandler(debugLoggingHandler);
        debugLoggingHandler.setNextHandler(infoLoggingHelper);

    }

    public LoggingHandler getLoggingHandler() {
        return loggingHandler;
    }
}
