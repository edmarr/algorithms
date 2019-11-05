package algorithms.resolved.ctci.chapterOne;

//Implement an algorithm to determine if a string has all unique characters.What if you cannot use additional data structures?

public class IsUniqueChars {
    public boolean isUnique(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((check & (1 << val)) > 0)
                return false;

            check |= (1 << val);
        }

        return true;

    }

    public boolean isUniqueCheckArray(String str) {
        boolean[] visited = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (visited[val])
                return false;
            visited[val] = true;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(new IsUniqueChars().isUnique(""));
        System.out.println(new IsUniqueChars().isUnique("abcd"));
        System.out.println(new IsUniqueChars().isUnique("aabcd"));
        System.out.println(new IsUniqueChars().isUnique("zbdeaa"));
        System.out.println(new IsUniqueChars().isUnique("abezdcd"));

        System.out.println();

        System.out.println(new IsUniqueChars().isUniqueCheckArray(""));
        System.out.println(new IsUniqueChars().isUniqueCheckArray("abcd"));
        System.out.println(new IsUniqueChars().isUniqueCheckArray("aabcd"));
        System.out.println(new IsUniqueChars().isUniqueCheckArray("zbdeaa"));
        System.out.println(new IsUniqueChars().isUniqueCheckArray("abezdcd"));
    }

}