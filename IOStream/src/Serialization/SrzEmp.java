package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee  implements Serializable {
	String ename;
	int eno;
	int esal;
	String add;
	public Employee(String ename, int eno, int esal, String add) {
		this.ename = ename;
		this.eno = eno;
		this.esal = esal;
		this.add = add;
	}
	
	public void getempdetails() {
		System.out.println("employee details here---->");
		System.out.println("Employee name : "+ename);
		System.out.println("Employee number : "+eno);
		System.out.println("Employee salary : "+esal);
		System.out.println("Employee address : "+add);
	}
	
	
	
}

public class SrzEmp{

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("F:/xyz/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp1 = new Employee("parvez", 111, 25000, "jaipur");
		System.out.println("Employee details before serialization");
		emp1.getempdetails();
		oos.writeObject(emp1);
		System.out.println();
		
		FileInputStream fis = new FileInputStream("F:/xyz/test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee)ois.readObject();
		System.out.println("Employee details after deserialization");
		emp2.getempdetails();
		System.out.println();
	}

}
