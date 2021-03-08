import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class TestDemo {




    //求两个正整数的最大公约数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num1 =  sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入数字");
        int num2 =  sc1.nextInt();
        int count = 1;
        while (count != 0){
            count = num1 % num2;
            num1 = num2;
            num2 = count;
        }

        System.out.println(num1);
    }



    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main14(String[] args) {
        double count = 0;
        double j = 1;
        for (int i = 1;i <= 100; i++ ){

            count += 1/(i*j);
            j *= -1;
        }
        System.out.println(count);
    }

    //输出n*n的乘法口诀表，n由用户输入。
    public static void main13(String[] args) {
        for (int i = 1; i<=9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i*j + " " );
            }
            System.out.print("\n");
        }
    }






    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num =  sc.nextInt();
        while(num != 0){
            System.out.println(num%10);
            num /= 10;
        }
    }



    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main11(String[] args) {
        int password = 610121;
        int i = 0;
        for( i = 1;i<= 3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码");
            int num =  sc.nextInt();
            if(password == num){
                System.out.println("密码正确");
                break;
            }else{
                System.out.println("密码错误，请重新输入");
            }
        }
        if(i == 4){
            System.out.println("输入次数超上限");
        }

    }



    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
    // 如；153＝1＋5＋3?，则153是一个“水仙花数“。）
    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num =  sc.nextInt();
        int num1 = num;
        int count = 0;
        while(num1 != 0){
            count += (num1%10)*(num1%10)*(num1%10);
            num1 = num1/10;
        }
        if (num == count){
            System.out.println(num + "是水仙花数");

        }else{
            System.out.println(num + "不是水仙花数");
        }
    }




    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num =  sc.nextInt();
        for (int i = 31; i>=1; i-=2){
            System.out.print((num >> i) & 1);

            }
        System.out.println("\n");
        for (int i = 30; i>=0; i-=2){
            System.out.print((num >> i) & 1);
            }
    }


    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num =  sc.nextInt();
        int  count = 0;

        for (int i = 0; i<32; i++){
            if (((num >> i) & 1) == 1){
                count++;
            }
        }
        System.out.println(count);
    }






    //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
    public static void main7(String[] args) {
        Random r = new Random(1);
        int ran = r.nextInt(100);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字");
            int num =  sc.nextInt();
            if (ran == num){
                System.out.println("猜测正确");
                break;
            }else if(ran > num){
                System.out.println("猜测比较小");
            }else if(ran < num){
                System.out.println("猜测比较大");
            }
        }
    }

    public static void main6(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.print("*");

            System.out.print("\t");
            System.out.print("\n");
          //  System.out.print(" ");

        }
    }


    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age =  sc.nextInt();
        if(age <= 18){
            System.out.println("少年");
        }else if(age >18 && age < 29){
            System.out.println("青年");
        }else if(age >28 && age < 56){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }


    //给定一个数字，判定一个数字是否是素数
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int i =  sc.nextInt();
        int j = 0;
        for(j = 2; j<=i; j++){
            if(i % j == 0){
                break;
            }
        }
        if(j == i){
            System.out.println(i+"是素数");
        }else{
            System.out.println(i+"不是素数");
        }

    }




    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {

        int i = 1;
        while(i <= 100){
            int j = 2;
            while(j<=i){
                if(i%j == 0){
                   break;
                }
                j++;
            }
            if(j==i){
                System.out.println(i);
            }
            i++;
        }


    }

    // 输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        for (int i = 1000; i<= 2000; i++){
            if(i % 100 == 0 && i % 400==0 || i%4 ==0 ){
                System.out.println(i);
            }
        }

    }
   //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int i = 1;
        while (i<=100){
            if (i%10 ==9||i/10==9){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
