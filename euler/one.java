public class one {
    public static void main(String[] args){
        long sum = 0;
        for (long i = 1; i < 100000; i++){
            if (i%3 == 0){
                sum += i; 
                continue;
            }
            if (i%5 == 0)
            {
                sum += i;
                continue;
            }   
        }
        System.out.println(sum);
    }
}
