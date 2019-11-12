package Location;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP:定位一个结点。
 * @author dell
 *
 */

public class IPTest {
	public static void main(String[] args) throws UnknownHostException {
		//使用.getLocalHost方法创建InetAddress对象，本机
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//返回本机地址
		System.out.println(addr.getHostName());//输出计算机名
		//根据域名得到netAddress对象
		addr=InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//返回百度服务器的ip:
		System.out.println(addr.getHostName());//输出：www.163.com
		//根据ip得到InetAddress对象
		addr=InetAddress.getByName("169.254.204.168");
		System.out.println(addr.getHostAddress());//返回定义的ip地址
		System.out.println(addr.getHostName());//如果不存在该ip或DNS服务器不允许进行IP地址和域名映射，getHostName方法就直接返回这个IP地址
	}

}
