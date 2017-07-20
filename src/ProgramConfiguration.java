import java.security.PublicKey;

/**
 * Created by fhani on 7/20/2017.
 */
public class ProgramConfiguration {
    public int connectionLimit;
    public int portNumber;
    public String URL;
    public int timeout;

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    private static ProgramConfiguration instance;

    private ProgramConfiguration(){}

    public static ProgramConfiguration getSingleInstance() {
        if (instance == null){
            instance = new ProgramConfiguration();
        }
        return instance;
    }




}
