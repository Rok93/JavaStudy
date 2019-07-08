package jdbc;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPJdbcSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		System.out.println("발신 시작");
		String msg = "폭염 주의하세요.";//2바이트 이상의 한글을 unicode사용
		byte[] b = msg.getBytes();//한글이반드시 유니코드가 아니므로(컴마다다름) 바이트로 보내야 함!
		DatagramPacket p = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 9999);
		ds.send(p);
		System.out.println("발신 종료");
		ds.close();
		
	}
}
