package ExceptionHandling;

class Student{
	String sname;
	int sno;
	String fname;
	String scourse;
	int marks;
	public Student(String sname, int sno, String fname, String scourse, int marks) {
		this.sname = sname;
		this.sno = sno;
		this.fname = fname;
		this.scourse = scourse;
		this.marks=marks;
	}
	
	public void getDetails() {
		System.out.println("Student name : "+sname);
		System.out.println("Stundent roll number : "+sno);
		System.out.println("Student father name : "+fname);
		System.out.println("Student course name : "+scourse);
		System.out.println("Student marks : "+marks);
		
		String status="";
		if(marks>=0 && marks<=30) {
			status="fail";
			} else if(marks>=30 && marks<=50) {
				status="third class";
				}else if(marks>=50 && marks<=70) {
					status="second class";
				}else if(marks>=70 && marks<=100) {
					status="first class";
				}else {
					throw new RuntimeException("invalid number , Marks should be between 0 to 100");
				}
		System.out.println("Student Status : "+status);
		}
	}
public class ThrowKeyword {
     public static void main(String args[]) {
    	 Student st = new Student("parvez",24,"anwar","java",80);
    	 st.getDetails();
     }
}
