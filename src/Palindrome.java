public class Palindrome {

    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        System.out.println(string + ". isPalindrome = " + isPalindrome(string));
        System.out.println();

        String string1 = "А Луна тонула";
        System.out.println(string1 + ". isPalindrome = " + isPalindrome(string1));
        System.out.println();

        String string2 = "Ве  ер     в епархии    и храп евреев";
        System.out.println(string2 + ". isPalindrome = " + isPalindrome(string2));
        System.out.println();

        String string3 = "Мама мыла раму";
        System.out.println(string3 + ". isPalindrome = " + isPalindrome(string3));
        System.out.println();

        String string4 = "  А Л ида га д ил  а";
        System.out.println(string4 + ". isPalindrome = " + isPalindrome(string4));
        System.out.println();

        String string5 = "А по морде ведром - опа!";
        System.out.println(string5 + ". isPalindrome = " + isPalindrome(string5));
    }

    private static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - i - 1;

        while (i <= j) {
            while (!Character.isLetter(string.charAt(i))) {
                i++;
            }

            while (!Character.isLetter(string.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(string.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}