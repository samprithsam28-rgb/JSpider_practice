import java.util.Arrays;

public class Array_Marge_Two_array {

    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        int b[] = {40, 50, 60, 70, 80};

        int c[] = merge(a, b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] merge(int a[], int b[]) {
        int c[] = new int[a.length + b.length];

        // Copy elements of array a
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy elements of array b
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        return c;
    }
}