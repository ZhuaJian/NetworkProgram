import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IpTest {
	public static void main(String[] args) {
		new IpTest().go();
	}
	public void go() {
		String IP = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			IP = br.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		//String IP="192.168.0.100/255.255.255.0";
		IP = IP.replace(" ", "");
		String[] temp = IP.split("/");
		String[] sIP = temp[0].split("\\.");
		/**
		 * �ж������ʽ�Ƿ���ȷ
		 */
		if (temp.length < 2) {
			System.out.println("�Բ��������ʽ����");
			System.exit(0);
		}
		int Mask = Integer.parseInt(temp[1]);
		int[] ip = new int[4];
		for (int i = 0; i < sIP.length; i++) {
			ip[i] = Integer.parseInt(sIP[i]);
		}
		/**
		 * IP��ַ���β��ܴ���255
		 */
		for (int i = 0; i < 4; i++) {
			if (ip[i] > 255) {
				System.out.println("�Բ���IP�������");
				System.exit(0);
			}
		}
		/**
		 * �ж�IP��ַ��������
		 */
		int ipclass = 0;
		if (ip[0] < 127) {
			System.out.println("A���ַ");
			ipclass = 1;
		} else if (ip[0] < 192) {
			System.out.println("B���ַ");
			ipclass = 2;
		} else if (ip[0] < 224) {
			System.out.println("C���ַ");
			ipclass = 3;
		}
		/**
		 * �ж����������Ƿ�������ȷ
		 */
		if (Mask < 8 * ipclass) {
			System.out.println("�Բ������������������");
			System.exit(0);
		}
		int b = 0;
		int a = Mask % 8;
		b = Mask / 8;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a; i++)
			sb.append('1');
		for (int i = 0; i < 8 - a; i++)
			sb.append('0');
		int end = Integer.parseInt(sb.toString(), 2);
		ip[b] = ip[b] & end;
		for (int i = b + 1; i < 4; i++)
			ip[i] = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print(ip[i]);
			if (i != 3)
				System.out.print(".");
		}
	}
}