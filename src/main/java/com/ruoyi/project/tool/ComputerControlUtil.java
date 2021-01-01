package com.ruoyi.project.tool;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 
 * @author kong-lh
 *
 */
public class ComputerControlUtil {
	/**
	 * 关闭计算机
	 * 
	 * @param MAC
	 * @param IP
	 * @return
	 */
	public static boolean startUp(String MAC, String IP) {
		try {
			int port = 7;
			byte[] macByte = new byte[6];
			String[] ips = MAC.split("\\:|\\-");
			for (int i = 0; i < 6; i++) {
				macByte[i] = (byte) Integer.parseInt(ips[i], 16);
			}
			// 用来存储网络唤醒数据包
			byte[] bys = new byte[6 + 16 * macByte.length];
			for (int i = 0; i < 6; i++) {
				bys[i] = (byte) 0xff;
			}
			for (int i = 6; i < bys.length; i += macByte.length) {
				System.arraycopy(macByte, 0, bys, i, macByte.length);
			}
			// 将字符形式的IP地址转换成标准的IP地址
			// InetAddress address = InetAddress.getByName(ip);
			InetAddress address = InetAddress.getByName(IP);
			// 生成标准的数据报
			DatagramPacket pack = new DatagramPacket(bys, bys.length, address, port);
			// 创建标准套接字，用来发送数据报
			DatagramSocket socket = new DatagramSocket();
			// 发送魔法包
			socket.send(pack);
			socket.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}
}
