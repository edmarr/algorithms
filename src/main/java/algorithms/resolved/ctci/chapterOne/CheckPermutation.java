package algorithms.resolved.ctci.chapterOne;

public class CheckPermutation {
    public boolean isPermuted(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int size = s1.length() -1;
        for (int i = 0; i <= size; i++) {
            if (s1.charAt(i) != s2.charAt(size - i))
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(new CheckPermutation().isPermuted("abc", "cba"));
        System.out.println(new CheckPermutation().isPermuted("abcs", "cba"));
        System.out.println(new CheckPermutation().isPermuted("abc", "cbb"));

    }

}