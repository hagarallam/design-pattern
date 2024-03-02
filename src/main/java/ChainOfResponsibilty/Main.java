package ChainOfResponsibilty;

public class Main {

    public static void main(String[] args) {
        LoggingRequest loggingRequest = new LoggingRequest(LoggingLevel.DEBUG,"This is a Debug message");
        LoggingChainService loggingChainService = new LoggingChainService();
        loggingChainService.getLoggingHandler().logRequest(loggingRequest);
    }
}
