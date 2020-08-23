package com.datastructures.stack;

public class ReverseWord {
    public static void main(String[] args) {
        String str="Atul Zambre";
        char a[]=str.toCharArray();
        SimpleStack simpleStack=new SimpleStack(str.length());
        for (int i=0;i<str.length();i++){
            simpleStack.push(a[i]);
        }
        for (int i=0;i<str.length();i++){
            a[i]= (char) simpleStack.pop();
        }
        System.out.println("reversed word:"+a.toString());
    }
}
