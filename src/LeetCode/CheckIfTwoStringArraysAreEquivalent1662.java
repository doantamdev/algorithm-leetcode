package LeetCode;
public class CheckIfTwoStringArraysAreEquivalent1662 {
    // public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     String s1 = "";
    //     String s2 = "";

    //     for(String s : word1){
    //         s1+=s;
    //     }
    //     for(String s : word2){
    //         s2+=s;
    //     }
    //     return s1.equals(s2);
    // }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String s : word1){
            s1.append(s);
        }
        for(String s : word2){
            s2.append(s);
        }
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {

    }
}
