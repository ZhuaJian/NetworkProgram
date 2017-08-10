import java.net.InetAddress;
import java.net.UnknownHostException;


public class ReverseTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getByName("14.215.177.37");
		System.out.println(ia.getCanonicalHostName());
	}
}
