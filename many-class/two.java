public class q2 {
    public static void main (String args[]){
        RandNum rand = new RandNum();
        rand.arrayAnlyisis();
        rand.displayInfo();
    }
}

class RandNum{
    private int[][] randList = new int[5][5];
    private int minimum;
    private int maximum;
    private float average;

    public RandNum(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                randList[i][j] = (int) (1 + (Math.random() * 100));
            }
        }
    } // initialize the random number array

    public void arrayAnlyisis(){
        minimum = randList[0][0];
        maximum = randList[0][0];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (randList[i][j] < minimum) {
                    minimum = randList[i][j];
                }
                if (randList[i][j] > maximum) {
                    maximum = randList[i][j];
                }
                

                average += randList[i][j];
            }
            average /= 25;
        }
    } // calculate class memebers minimum, maximum, average

    public void displayArray(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( randList[i][j] < 10){
                    System.out.print(randList[i][j] + "  ");
                } else {
                    System.out.print(randList[i][j] + " ");
                }   
            }
            System.out.println();
        }
    } // separate method to display array
    
    public void displayInfo(){
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Average: " + average);
        displayArray();
    } // display class memebrs 

    
}