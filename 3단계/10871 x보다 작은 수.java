import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int hint = s.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        for(int j = 0; j < n; j++){
            if(arr[j] < hint)
                System.out.print(arr[j] + " ");
        }



    }
}