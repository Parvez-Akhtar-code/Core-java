package TryWithResources;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TWR {

	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("F:/abc/maien.txt");
			FileOutputStream fos = new FileOutputStream("F:/xyz/junaid.txt");
				
				
				)
		{
		int size = fis.available();
		byte[] b=new byte[size];
		fis.read(b);
		
		fos.write(b);
		System.out.println("txt file copied");
		} catch (Exception e) {
			e.printStackTrace();
		
		}

	}

}
