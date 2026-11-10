public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int num = Integer.parseInt(args[0]);
        int sign = 1;
        for(int i = 1; i <= 2*num; i+=2){
            if(sign%2 == 0){approxPi -= 1.0/i;}
            else{approxPi += 1.0/i;}
            sign ++;
        }
        approxPi*=4;
        
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}
