import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author fujiwo
 */
public class ClassDemoOne {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.zime.edu.cn", 80);
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getChannel());
        socket.setSoTimeout(3000);

        String head = "GET / HTTP/1.1\r\n";
        head += "Host:www.zime.edu.cn\r\n\r\n";
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(head.getBytes());
        outputStream.flush();

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");

        int c = 0;
        while ((c = inputStreamReader.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
