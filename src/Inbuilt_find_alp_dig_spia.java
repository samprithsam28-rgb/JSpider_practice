public class Inbuilt_find_alp_dig_spia {
    public static void main(String[] args) {
        String s = "abc@123";
        int ac = 0, dc = 0, sc = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);

            if (Character.isAlphabetic(ch)) {
                ac++;
            } else if (Character.isDigit(ch)) {
                dc++;
            } else {
                sc++;
            }
        }

        System.out.println("no of alphabet: " + ac);
        System.out.println("no of dig: " + dc);
        System.out.println("no of special: " + sc);
    }
}