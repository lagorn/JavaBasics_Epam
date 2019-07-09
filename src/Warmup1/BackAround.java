package Warmup1;

public class BackAround {
    public String backAround(String str){
        String a;
        int k = str.length() - 1;
        char c = str.charAt(k);
        a = c+str+c;
        return a;
    }
}
