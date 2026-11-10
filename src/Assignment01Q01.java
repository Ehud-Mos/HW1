public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        int arg_len = args.length;
        for(int i = 0; i<arg_len ;i++){
            if((int)(args[i].charAt(0))%5 == 0){
                System.out.println(args[i].charAt(0));
            }
        }
    }
}
