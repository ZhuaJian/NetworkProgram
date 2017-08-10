import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;


public class IPCharacteristics {

	public static void main(String[] args) {
		System.out.println("Please input an address or ip: ");
		/*
		 * 用输入流的方法实现终端输入*/
		String IP = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			IP = br.readLine();
		} catch (IOException ex) {  
			ex.printStackTrace();
		}
		/*
		 * 用Scanner类实现简单的输入*/
//		Scanner s = new Scanner(System.in);
//		String IP = s.nextLine();
		
		System.out.println("----------------------------");
		System.out.println("Please wait a minute...");
		try {
	        Thread.sleep(3000);
	        }catch(InterruptedException e) {
	        	e.printStackTrace();
	        }
		System.out.println("----------------------------");
		try {
			InetAddress address = InetAddress.getByName(IP);
			byte []ip = address.getAddress();
			int[] array = new int[5];
			for(int i=0;i<ip.length;i++){
				array[i] = (ip[i]<0) ? 256 + ip[i] : ip[i];
			}
			String str = TellIpType(array[0]);
			System.out.println(str);
			
			if(address.isAnyLocalAddress()){
				System.out.println(address+" is a  wildcard address.");
			}
			if(address.isLoopbackAddress()){
				System.out.println(address+" is loopback address.");
			}
			if(address.isLinkLocalAddress()){
				System.out.println(address+" is a link-local address.");
			}else if(address.isSiteLocalAddress()){
				System.out.println(address+" is a site-local address.");
			}else{
				System.out.println(address+" is a global address.");
			}
			if(address.isMulticastAddress()){
				if(address.isMCGlobal()){
					System.out.println(address+" is a global multicast address.");
				}else if(address.isMCOrgLocal()){
					System.out.println(address+" is an organization wide multicast address.");
				}else if(address.isMCSiteLocal()){
					System.out.println(address+" is a site wide multicast address.");
				}else if(address.isMCLinkLocal()){
					System.out.println(address+" is a subnet wide multicast address.");
				}else if(address.isMCNodeLocal()){
					System.out.println(address+" is an interface-local multicast address.");
				}else{
					System.out.println(address+" is an unknow multicast address type.");
				}
			}else{
				System.out.println(address+" is a unicast address.");
			}
		} catch (UnknownHostException ex) {
			System.out.println("Could not resolve " + IP);
		}
		

	}

    public static String TellIpType(int num) {
        if(num<127)
            return "The Site(IP) was in A network segment.";
        else if(num<192)
            return "The Site(IP) was in B network segment.";
        else if(num<224)
            return "The Site(IP) was in C network segment.";
        else if(num<240)
            return "The Site(IP) was in D network segment.";
        else
            return "The Site(IP) was in E network segment.";
    }


}
