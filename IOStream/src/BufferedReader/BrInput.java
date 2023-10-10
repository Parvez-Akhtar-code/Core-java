package BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BrInput {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter student name :");
		String sname = br.readLine();
		System.out.print("enter student roll number : ");
		int sno = Integer.parseInt(br.readLine());
		System.out.print("enter student course : ");
		String cr = br.readLine();
		System.out.print("enter student address : ");
		String add = br.readLine();
		System.out.println();
		System.out.println("Student Details here ----->");
		System.out.println("Student name : "+sname);
		System.out.println("Student roll number : "+sno);
		System.out.println("Student course : "+cr);
		System.out.println("Student address : "+add);

	}

}
