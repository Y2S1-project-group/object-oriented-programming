package interfaces;

interface inter{
	abstract final void print();
}

class Apple implements inter{
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
}

abstract class Orange{
	public abstract void play();
}

public class AppleInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1 = new StringBuilder();
		str1.append("this is string");
		StringBuilder str2 = str1;
		str1.replace(1, 5, "testing");
		System.out.println(str1);
		System.out.println(str2);
	}
}

