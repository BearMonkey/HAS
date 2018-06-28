package org.monkey.has.action;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎使用xxx家电销售系统");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("------------------输入数字【0-5】选择功能------------------");
            System.out.println("【1】增加型号");
            System.out.println("【2】增加品牌");
            System.out.println("【3】增加类型");
            System.out.println("【4】查询");
            System.out.println("【5】统计");
            System.out.println("【0】退出");
            System.out.println("---------------------------------------------------------");
            int function=0;
            function = sc.nextInt(); 
            if(1 == function) {
                HaAction haAction = new HaAction();
                haAction.main();
            } else if( 2 == function) {
                HaBrandsAction brandsAction = new HaBrandsAction();
                brandsAction.main();
            } else if( 3 == function) {
                HaTypeAction typeAction = new HaTypeAction();
                typeAction.main();
            } else if( 4 == function) {
                
            } else if( 5 == function) {
                
            } else {
                break;
            }
        }
    }
}
