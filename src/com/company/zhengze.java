package com.company;
/*
*       正则表达式：一套规则来匹配字符串
* */
import java.util.Scanner;

public class zhengze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
      //  System.out.println(check(s));
        System.out.println(s.matches("[1-9][0-9]{4,14}"));
    }
   /* public static boolean check(String s){
        int len=s.length();
        if(len<5||len>15)
        {
            return false;
        }
        char a=s.charAt(0);
        if(a=='0')
        {
            return false;
        }
        for (int i = 0; i <len ; i++) {
            char b=s.charAt(i);
            if(b<'0'||b>'9')
            {
                return false;
            }
        }
        return true;
    }*/

}
