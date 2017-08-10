import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetByname02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.waner.cn");
			for(InetAddress address : addresses){
				System.out.println(address);
			}
			InetAddress me = InetAddress.getLocalHost();//查看当前主机信息
			String myip = me.getHostAddress();//获取当前主机ip
			System.out.println("Search by "+ myip);
		} catch (UnknownHostException ex) {
			System.out.println("Count not find the host.");
		}
	}

}
