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
			InetAddress me = InetAddress.getLocalHost();//�鿴��ǰ������Ϣ
			String myip = me.getHostAddress();//��ȡ��ǰ����ip
			System.out.println("Search by "+ myip);
		} catch (UnknownHostException ex) {
			System.out.println("Count not find the host.");
		}
	}

}
