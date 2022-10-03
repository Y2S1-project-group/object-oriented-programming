package array;

public class arrayMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {65, 66, 67, 68};
		char [] charArr = new char[arr.length];
		for(int i = 0; i < arr.length; i++) {
			charArr[i] = (char)arr[i];
		}
		for(char c: charArr) {
			System.out.println(c + ", ");
		}
	}
}
