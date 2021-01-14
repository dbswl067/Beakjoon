import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int arr[] = new int[10000];
        int tmp;

        for(int i = 0; i < 10000; i++){
            for(int j = 1; j < 10000; j++){
                tmp = i * j + (i * j / 1000 % 10) + (i * j / 100 % 10)+ (i * j / 10 % 10)+ (i * j % 10);
                if(tmp > 10000)
                    break;
                else {
                    if(tmp > 0)
                        arr[tmp - 1]++;
                }
            }
        }
        for (int i = 0; i < 10000; i++) {
            if(arr[i] == 0)
                System.out.println(i + 1);
        }
    }
}
