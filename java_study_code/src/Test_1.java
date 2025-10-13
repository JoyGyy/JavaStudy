//请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("input: ");
        int lastScore = s.nextInt();
        System.out.print("input: ");
        int thisScore = s.nextInt();
        float per = (float) (thisScore-lastScore) / lastScore *100;
        System.out.printf("percent: %.2f%%",per);
    }
}
