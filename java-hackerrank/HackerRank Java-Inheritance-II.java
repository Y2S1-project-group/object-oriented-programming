class Atrithematic {
    public Atrithematic() {
    };
}

class Adder extends Atrithematic {

    private int num;
    private int num2;
    private String name;

    public Adder() {
        this.num = 0;
        this.num2 = 0;
        this.name = "";
    }

    public int add(int num, int num2) {
        return num + num2;
    }

}

public class Q26 {
    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
 