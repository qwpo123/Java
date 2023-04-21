import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author 
 */
public class ClassDemoTwo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("time-a.nist.gov", 13);
        socket.setSoTimeout(8000);
        InputStream inputStream = socket.getInputStream();
        int c;
        while ((c = inputStream.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
