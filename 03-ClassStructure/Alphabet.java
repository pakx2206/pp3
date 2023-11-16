public class Alphabet {
    static boolean isAlphabet(String x){
        char[] alp = x.toCharArray();
        for (int i=0;i<alp.length-1;i++)
        {
            if(alp[i]>alp[i+1]){
                return false;
            }
        }
        if (alp[alp.length-1]>=alp[alp.length-2]){
            return true;
        }else{
            return false;
        }
    }
}
