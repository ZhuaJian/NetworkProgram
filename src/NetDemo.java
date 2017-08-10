import java.net.InetAddress;


public class NetDemo {
    public static void main(String[] args) throws Exception{
        String str = "172.20.223.120";
        String[] ipStr = str.split("\\.");
        byte[] ipBuf = new byte[4];
        for(int i = 0; i < 4; i++){
            ipBuf[i] = (byte)(Integer.parseInt(ipStr[i])&0xff);
        }
        InetAddress ia = InetAddress.getByAddress("unknow.com",ipBuf);
        System.out.println(ia);
    }
}
