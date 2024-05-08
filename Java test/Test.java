package org.example;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(toUpperCase(new char[]{'a'}));
        System.out.println(tc1singlelowercase(new char[]{'a'}));
        System.out.println(tc2singleuppercase(new char[]{'A'}));
        System.out.println(tc3mixedchar(new char[]{'a','A'}));
        System.out.println(tc4numbers(new char[]{'1','2','3'}));
        System.out.println(tc5null(new char[]{}));
    }

    public static String toUpperCase(char[] str){
        for(int i=0,e=str.length-1;i<=e;++i){
            if(Character.isLetter(str[i])&& Character.isLowerCase(str[i])){
                str[i]=(char)(str[i]-32);
            }
        }
        String s = "";
        for(char ch : str){
            s+=ch+"";
        }
        return s;
    }

    public static boolean tc1singlelowercase(char[] s){
        String st = "A";
        return st.equals(toUpperCase(s));
    }
    public static boolean tc2singleuppercase(char[] s){
        String st = "A";
        return st.equals(toUpperCase(s));
    }
    public static boolean tc3mixedchar(char[] s){
        String st = "AA";
        return st.equals(toUpperCase(s));
    }
    public static boolean tc4numbers(char[] s){
        String st = "123";
        return st.equals(toUpperCase(s));
    }
    public static boolean tc5null(char[] s){
        String st = null;
        return st.equals(toUpperCase(s));
    }
}
