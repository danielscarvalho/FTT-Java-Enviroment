import java.net.InetAddress;
import java.net.UnknownHostException;

public class JEnviroment {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(new java.util.Date());
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name") + " " +System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("java.version"));
		
		try {
		
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().getHostAddress());
		
		} catch (UnknownHostException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
