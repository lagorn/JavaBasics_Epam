package Warmup2;

public class stringMatch {
    public int stringMatch(String a, String b) {
        int arrayLength1 = a.length();
        int arrayLength2 = b.length();
        int firstElement1 = 0;
        int firstElement2 = 1;
        int numberCoinidences = 0;

        for (int i = 0; i < arrayLength1; i++) {
            if(a.charAt(firstElement1) == b.charAt(firstElement1)){
                if(a.charAt(firstElement2) == b.charAt(firstElement2)){
                    firstElement1++;
                    firstElement2++;
                    numberCoinidences++;
                }
            }
            else{
                firstElement1++;
                firstElement2++;
            }
        }
        return numberCoinidences;
    }
}
