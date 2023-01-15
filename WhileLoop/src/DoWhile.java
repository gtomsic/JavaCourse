public class DoWhile {
    public static void main(String[] args){
        int j = 1;
        boolean isReady = false;

        do{
            if(j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        } while (isReady);
    }
}
