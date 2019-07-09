package Warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {

        StringBuilder bul = new StringBuilder(str);

        bul.deleteCharAt(n);

        return String.valueOf(bul);



    }

}
