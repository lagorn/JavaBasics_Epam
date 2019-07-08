package Warmup2;

public class stringMatch {
    public int stringMatch(String a, String b) {
        int arrayLength1 = a.length();
        int arrayLength2 = b.length();
        int firstElement1 = 0;
        int numberCoinidences = 0;

        for (int i = 0; i < arrayLength1; i++) {
            if(a.regionMatches(true,firstElement1,b,firstElement1,2 ));{
                numberCoinidences++;
            }
        }
        return numberCoinidences;
    }
}
