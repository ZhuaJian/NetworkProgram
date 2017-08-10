import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetByname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InetAddress address = InetAddress.getByName("www.waner.cn");
			System.out.println(address);
//			System.out.println(address.getHostName());//反向查找主机名
		}catch(UnknownHostException ex){
			System.out.println("Count not find the host.");
		}

	}

}
