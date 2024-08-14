package day2;

public class typeCasting {
    public static void main(String[] args) {
        final double PI=3.14;
        int r=2;
        int result = (int)(2*PI*r);
        System.out.println(result);//explicit

        int x=1;
        double res=x+2;
        System.out.println(res);//implicit
    }
}
//byte>>short>>int>>float>>double(implicit): in this we have no data loss
//double>>float>>int>>short>>byte(explicit): in this we have data loss

