package interfaces;

interface I1{
	void method1(int a, int b);
	void method2(String a);
}

interface I2{
	void method3(int a, int b);
	void method2(String a);
}

class C1 implements I1, I2{
	public void method1(int a, int b) {
		
	}
	public void method2(String a) {
		
	}
	public void method3(int a, int b) {
		
	}
}

public class PInteface {
	public static void main(String args[]) {
		C1 c1 = new C1();
		c1.method3(2, 3);
	}
}
