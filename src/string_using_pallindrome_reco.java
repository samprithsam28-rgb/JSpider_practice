public class string_using_pallindrome_reco {

    public static void main(String[] args) {
        String s = "madam";

        if (isPallindrome(s)) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }

    public static boolean isPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}