package algorithms.resolved.daily;

public class PalindromeInt {
    public static void main(String[] args) {
        System.out.println(new PalindromeInt().check(new int[] {3, 2, 3}));
        System.out.println(new PalindromeInt().check(new int[] {3, 2, 3}));
        System.out.println(new PalindromeInt().check(new int[] {4, 3,2,0,1,2,3,4}));
        System.out.println(new PalindromeInt().check(new int[] {4, 3,2,1,2,3,4}));
    }

    public boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == arr[(arr.length -1) - i])) {
                return false;
            }
        }
        return true;
    }

}
