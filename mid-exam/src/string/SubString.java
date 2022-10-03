package string;

public class SubString {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Sri Lanka Institute of Information Technology");
		sb.reverse();
		sb.substring(0, 2);
		sb.replace(0, 5, "asdfasdf");
		System.out.println(sb);
		
		String test = "peter parker";
		test = test.substring(3, 4);
		System.out.println(test);
		
		String result = new String("SLIIT Campus");
		StringBuffer string = new StringBuffer(result.toUpperCase().toLowerCase().substring(0, 6));
		System.out.println(result);
		System.out.println(string);
	}
}
