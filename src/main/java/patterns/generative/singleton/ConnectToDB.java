package patterns.generative.singleton;

public class ConnectToDB {

    private static ConnectToDB connectToDB;

    private ConnectToDB() {
        System.out.println("new DB");
    }

    public static synchronized ConnectToDB getConnectToDB() {
        if (connectToDB == null) {
            connectToDB = new ConnectToDB();
        }
        return connectToDB;
    }
}
