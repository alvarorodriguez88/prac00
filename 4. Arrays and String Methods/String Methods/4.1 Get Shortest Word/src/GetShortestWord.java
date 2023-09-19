public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String word1, String word2){
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 > l2){
            return word2;
        }
        else if (l2 > l1){
            return word1;
        }
        else {
            return word1;
        }
    }
}