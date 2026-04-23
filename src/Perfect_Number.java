//method using perfect number
public class Perfect_Number {

    public static void main(String[] args) 
    {
        int num = 28;
        isPerfect(num);
    }

    static void isPerfect(int n)
    {
        int sum = 0;

        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is Not a Perfect Number");
    }
}