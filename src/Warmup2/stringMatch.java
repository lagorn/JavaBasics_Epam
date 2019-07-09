package Warmup2;

public class stringMatch {
    public int stringMatch(String a, String b) {
        int arrayLength1 = a.length();
        int arrayLength2 = b.length();
        int firstElement1 = 0;
        int firstElement2 = 1;
        int numberCoinidences = 0;

        if((arrayLength1==0)||(arrayLength2==0)){
            return numberCoinidences;
        }

        if(arrayLength1>arrayLength2){
            for (int i = 1; i < arrayLength2; i++) {
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
        else if(arrayLength1<arrayLength2) {
            for (int i = 1; i < arrayLength1; i++) {
                if (a.charAt(firstElement1) == b.charAt(firstElement1)) {
                    if (a.charAt(firstElement2) == b.charAt(firstElement2)) {
                        firstElement1++;
                        firstElement2++;
                        numberCoinidences++;
                    }
                } else {
                    firstElement1++;
                    firstElement2++;
                }
            }
            return numberCoinidences;
        }
        else {
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

    public int stringMatch2(String a, String b){
        int firstElement1 = 0;
        int firstElement2 = 1;
        int numberCoinidences = 0;
        String str;

        if((a.length()==0)||(b.length()==0)){
            return 0;
        }

        if(a.length()>b.length()){
            for (int i = 1; i < b.length(); i++) {
                str = b.substring(firstElement1,firstElement2);
                if((b.indexOf(str))==-1){
                    firstElement1++;
                    firstElement2++;
                }
                else if((b.indexOf(str))<=0){
                    firstElement1++;
                    firstElement2++;
                    numberCoinidences++;
                }
            }
            return numberCoinidences;
        }
        else if(a.length()<b.length()){
            for (int i = 1; i < a.length(); i++) {
                str = a.substring(firstElement1,firstElement2);
                if((a.indexOf(str))==-1){
                    firstElement1++;
                    firstElement2++;
                }
                else if((a.indexOf(str))<=0){
                    firstElement1++;
                    firstElement2++;
                    numberCoinidences++;
                }
            }
            return numberCoinidences;
        }
        else{
            for (int i = 1; i < a.length(); i++) {
                str = a.substring(firstElement1,firstElement2);
                if((a.indexOf(str))==-1){
                    firstElement1++;
                    firstElement2++;
                }
                else if((a.indexOf(str))<=0){
                    firstElement1++;
                    firstElement2++;
                    numberCoinidences++;
                }
            }
            return numberCoinidences;
        }
    }
    public int stringMatch3(String a, String b) { // Это тот метод который работает! Остальные только на половину)
        int count = 0;

        for (int i = 0; i < Math.min(a.length(), b.length()) - 1; i++)
            if (a.substring(i, i+2).equals(b.substring(i, i+2)))
                count++;
        return count;
    }
}
