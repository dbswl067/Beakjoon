import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[9];
        int max = -1, index = -1;

        for(int i = 0; i < 9; i++){
            arr[i] = s.nextInt();
            if(arr[i] > max){
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max + "\n" + index);
    }
}