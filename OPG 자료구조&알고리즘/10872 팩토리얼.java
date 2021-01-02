import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fac = 1;

        for(int i = 0; i < n; i++){
            fac *= (i + 1);
        }
        System.out.println(fac);
    }
}