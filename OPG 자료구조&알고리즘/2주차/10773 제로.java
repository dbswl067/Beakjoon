import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int top = -1;
        int sum = 0;

        for(int i = 0; i < n; i++){
            int money = s.nextInt();
            if(money != 0){
                top++;
                arr[top] = money;
                sum += arr[top];
            }
            if(money == 0){
                sum -= arr[top];
                top--;
            }
        }
        System.out.println(sum);
    }
}
