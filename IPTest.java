package Location;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP:��λһ����㡣
 * @author dell
 *
 */

public class IPTest {
	public static void main(String[] args) throws UnknownHostException {
		//ʹ��.getLocalHost��������InetAddress���󣬱���
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//���ر�����ַ
		System.out.println(addr.getHostName());//����������
		//���������õ�netAddress����
		addr=InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//���ذٶȷ�������ip:
		System.out.println(addr.getHostName());//�����www.163.com
		//����ip�õ�InetAddress����
		addr=InetAddress.getByName("169.254.204.168");
		System.out.println(addr.getHostAddress());//���ض����ip��ַ
		System.out.println(addr.getHostName());//��������ڸ�ip��DNS���������������IP��ַ������ӳ�䣬getHostName������ֱ�ӷ������IP��ַ
	}

}
