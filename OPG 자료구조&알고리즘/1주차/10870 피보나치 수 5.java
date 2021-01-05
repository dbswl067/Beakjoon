import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if (n <= 1)
            return  n;
        else
            return fibo(n - 1) + fibo(n- 2);
    }
}
