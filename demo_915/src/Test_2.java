import java.util.Scanner;
//请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
//
//BMI = 体重(kg) / 身高(m)的平方
//BMI结果：
//
//过轻：低于18.5
//正常：18.5 ~ 25
//过重：25 ~ 28
//肥胖：28 ~ 32
//非常肥胖：高于32

public class Test_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("input weight(kg): ");
        float w = s.nextFloat();
        System.out.print("input height(m): ");
        float h = s.nextFloat();
        float res = w / (h * h);
        if(res < 18.5){
            System.out.println("guoqing");
        }
        else if(res >= 18.5 && res < 25){
            System.out.println("zhengchang");
        }
        else if(res >= 25 && res < 28){
            System.out.println("guozhong");
        }
        else if(res >= 28 && res < 32){
            System.out.println("feipang");
        }
        else{
            System.out.println("feichangfeipang");
        }
    }
}
