public class two {
    public static void main (String[] args){
        int i = 1;
	    int j = 2;
	    int k;
	    int sum = 0;
	for ( ; j < 4000000; ){
		System.out.println(i + "+" +j);
		if ( j%2 == 0);{
        sum += j;
        }
		k = j;
		j = i + k;
		i = k;
	}
	System.out.println(
    );
}
}
