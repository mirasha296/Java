public class ForLoopScope{
    public static void main (String[] args){
        int i;
        for (i = 1; i < 4; i++){
            System.out.println("Inside for loop: " + i);
        }
        
        System.out.println("Outside for loop " + i);
    }
}