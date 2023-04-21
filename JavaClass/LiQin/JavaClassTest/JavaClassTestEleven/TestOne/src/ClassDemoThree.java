import java.io.IOException;
import java.net.Socket;

/**
 * @author fujiwo
 */
public class ClassDemoThree {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.zime.edu.cn", 80);
        System.out.println("端口:" + socket.getPort());
        for (int i = 40000; i < 60000; i ++) {
            Socket socket1 = new Socket("127.0.0.1", i);
            System.out.println("端口:" + socket1.getPort());
            socket1.close();
        }
    }
}
