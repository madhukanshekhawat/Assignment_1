package day5;

public class factEx {
    static int fun(int n){
        if(n==0){
            return 0;
        }
        else {
            return n+fun(n-1);
        }
    }
    public static void main(String[] args) {
 System.out.println(fun(10));
    }
}
