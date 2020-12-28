import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int new_number = -1, a = n,sum = 0, cnt = 0;
        int num1 = 0, num2 = 0;

        while(n != new_number){
            if(a < 10)
                num1 = 0;
            else
                num1 = a / 10;
            num2 = a % 10;
            sum = num1 + num2;
            new_number = (num2 * 10) + (sum % 10);
            a = new_number;
            cnt++;
        }
        System.out.println(cnt);
    }
}