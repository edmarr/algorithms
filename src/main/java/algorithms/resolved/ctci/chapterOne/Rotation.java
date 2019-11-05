package algorithms.resolved.ctci.chapterOne;

// Assume you have a method isSubstring which checks if one word is a isSubstring of another.
// Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only
// one call to isSubstring(e.g., "waterbottle" is a rotation of "erbottlewat").
public class Rotation {
    public boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if(len ==s2.length() && len > 0){
            //return isSubstring(s1.concat(s1) , s2);
            }
       
        return false;

    }

    public static void main(String[] args) {
        System.out.println(new Rotation().isRotation("waterbottle", "erbottlewat"));
        System.out.println(new Rotation().isRotation("penblue", "jiujitsu"));

    }

}