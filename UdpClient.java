import java.net.*;
import java.io.*;


class UdpClient{

	public static void main(String s1[]) throws Exception{

		DatagramSocket ds = new DatagramSocket();
		String s = "India isa good Country";
		byte b[] = s.getBytes();
		DatagramPacket dp = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 8);
		ds.send(dp);

	}
}