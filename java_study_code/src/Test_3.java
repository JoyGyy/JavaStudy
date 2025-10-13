import java.util.Scanner;
//使用switch实现一个简单的石头、剪子、布游戏。
public class Test_3 {
    public static void main(String[] args){
        System.out.println("1.shitou");
        System.out.println("2.jiandao");
        System.out.println("3.bu");
        System.out.print("input: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch(n){
            case 1 -> System.out.println("shitou");
            case 2 -> System.out.println("jiandao");
            case 3 -> System.out.println("bu");
            default -> System.out.println("wuxiao");
        }
    }
}
