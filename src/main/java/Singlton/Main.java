package Singlton;

public class Main {
    public static void main(String[] args) {

        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.hashCode());


        DBConnection dbConnection2 = DBConnection.getInstance();
        System.out.println(dbConnection2.hashCode());

    }
}
