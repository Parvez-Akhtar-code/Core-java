package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:/xyz/Sunset.jpg");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		
		FileOutputStream fos = new FileOutputStream("F:/abc/Sunset1.jpg");
		fos.write(b);
		System.out.println("image copied successfully");
		

	}

}
