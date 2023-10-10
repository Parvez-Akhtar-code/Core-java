package ScannerIO;

import java.util.Scanner;

public class StudentBySio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter student name : ");
		String sname = sc.nextLine();
		System.out.print("enter student roll no : ");
		int sno = sc.nextInt();
		System.out.print("enter student course : ");
		String cr =sc.next();
		System.out.print("enter student address : ");
		String add=sc.next();
		System.out.println();
		System.out.println("Student Details here ---->");
		System.out.println("Student name : "+sname);
		System.out.println("Student roll no : "+sno);
		System.out.println("Student course :"+cr);
		System.out.println("Student add : "+add);
		
	}

}
