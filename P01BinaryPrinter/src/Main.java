//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int num = 100;
        printBinary(num);
    }

    // 通过右移实现二进制的输出
    private static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            if ((num & (1 << i)) == 0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
        }
    }
}