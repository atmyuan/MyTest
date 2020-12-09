package main.com.atmyuan.code.entry;

public class Class01 {

    public static void main(String[] args) {
        //先定义一个整形数组，后续使用随机造数器(暂时这么叫)
        int a = 1;
        printBit(a);
    }

    //打印整数的二进制32位数
    public static void printBit(int a){
        //00000000000000000000000000000001
        for (int i = 31 ; i > 0 ; i--){
            System.out.print(a >> i == 0 ? 0:1);
        }
    }
}
