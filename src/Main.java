public class Main {
//    use recursion to add all the numbers between 20 and 25
     static int sum(int start, int end){
        if (end>start){
            return end +sum(start, end-1);
        }else{
            return end;
        }
    }
    public static void main(String[] args){
        int result= sum(20,25);
        System.out.println(result);
    }
}
