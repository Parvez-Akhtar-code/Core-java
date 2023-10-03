package ExceptionHandling;
class A{
	int m1() {
		
	try{
		return 10;
	}catch(Exception e){
		return 20;
	}finally {
		return 30;
	}
	}
}

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		int result = a.m1();
		System.out.println(result);
	}

}
