import java.util.Arrays;
public class Test_5 {
    // 降序排序
        public static void main(String[] args) {
            int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
            // 排序前:
            System.out.println(Arrays.toString(ns));
            // TODO:
            Arrays.sort(ns);
            int[] new_ns = new int[ns.length];
            int count = ns.length - 1;
            for(int i = 0;i < ns.length;i++){
                new_ns[i] = ns[count];
                count--;
            }
            ns = new_ns;
            // 排序后:
            System.out.println(Arrays.toString(ns));
            if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
                System.out.println("测试成功");
            } else {
                System.out.println("测试失败");
            }
        }

}
