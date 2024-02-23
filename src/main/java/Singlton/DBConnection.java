package Singlton;

public class DBConnection {


    private static DBConnection dbConnection  = null ;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if(dbConnection == null){
            // To be Thread Safe
            synchronized (DBConnection.class){
                if(dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
