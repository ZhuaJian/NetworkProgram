import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetByaddress {

	public static void main(String[] args) {
		byte[] address = {127,23,(byte)216,(byte)196};
		try{
		InetAddress lessWrong = InetAddress.getByAddress(address);
		InetAddress lessWrongWithName = InetAddress.getByAddress("lesswrong.com",address);
		System.out.println(lessWrong);
		System.out.println(lessWrongWithName);
		}catch(UnknownHostException ex){
			System.out.println("Something wrong...");
		}
	}

}
