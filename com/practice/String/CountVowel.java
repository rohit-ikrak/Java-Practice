package com.practice.String;

public class CountVowel {
    public static void main(String[] args) {
        String str = "Abhishek";
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int len = str.length();
        int count = 0;
        for(int i=0; i<len;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
