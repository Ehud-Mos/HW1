public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int i1 = 1;
        int i2 = 1;
        System.out.print(i1 + " " + i2);
        int numOdd = 2;
        for(int i = 2; i < x; i++){
            int temp = i1;
            i1 = i2;
            i2 = i1 + temp;
            System.out.print(" " + i2);
            if(i2%2 == 1){numOdd++;}

        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
