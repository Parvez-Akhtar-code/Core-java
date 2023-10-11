package Exterilization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Student implements Externalizable{
	String sname;
	String sno;
	String smail;
	String smobile;
	
	public Student(String sname, String sno, String smail, String smobile) {
		this.sname = sname;
		this.sno = sno;
		this.smail = smail;
		this.smobile = smobile;
	}
	
	public Student() {
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		// no = dss-111  dss=0 , 111=1
		String[] str1 = sno.split("-");
		int no = Integer.parseInt(str1[1]);
		
		String[] str2 = smail.split("@");
		String mail = str2[0];
		
		String[] str3 = smobile.split("-");
		long mobile = Long.parseLong(str3[1]);
		
		out.writeUTF(sname);
		out.writeInt(no);
		out.writeUTF(mail);
		out.writeLong(mobile);
	}
	
   @Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	sname = in.readUTF();
	sno = "dss-" + in.readInt();
	smail = in.readUTF()+"@dss.com";
	smobile ="+91"+in.readLong();
}	
   
   public void GetStudentDetails() {
	   System.out.println("Student details here--->");
	   System.out.println("Student name : "+sname);
	   System.out.println("Student roll no : "+sno);
	   System.out.println("Student email : "+smail);
	   System.out.println("Student phone number : "+smobile);
   }
}



public class ExtStu {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos= new FileOutputStream("F:/abc/test1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student st1 = new Student("parvez", "dss-111", "parvez@dss.com", "+91-7014807747");
		System.out.println("Before Serialization");
		System.out.println();
		st1.GetStudentDetails();
		oos.writeObject(st1);
		System.out.println();
		
		FileInputStream fis = new FileInputStream("F:/abc/test1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st2 = (Student)ois.readObject();
		System.out.println("After Serialization");
		System.out.println();
		st2.GetStudentDetails();

	}

}
