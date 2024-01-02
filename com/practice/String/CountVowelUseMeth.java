package com.practice.String;

public class CountVowelUseMeth {
    public int countVowel(String str, int len){
        int count = 0;
        char[] ch =  str.toCharArray();
        for(int i=0; i<len;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountVowelUseMeth cvum = new CountVowelUseMeth();
        String str = "rohit karki";
        int len = str.length();
        int count = cvum.countVowel(str, len);
        System.out.println(count);
    }
}
