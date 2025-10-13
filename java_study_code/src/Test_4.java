import java.util.Scanner;
public class Test_4 {
    public static void main(String[] args){
        double pi = 0;
        for(int i = 0;i < 100000;i++){
            pi += Math.pow(-1,i) * (1.0 / (2 * i + 1)) * 4;
        }
        System.out.println(pi);
    }
}
