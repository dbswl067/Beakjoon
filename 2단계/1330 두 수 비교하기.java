import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(-10000 <= a && -10000 <= b && a <= 10000 && b <= 10000)
        {
            if(a > b)
                System.out.println(">");
            if(a < b)
                System.out.println("<");
            if(a == b)
                System.out.println("==");
        }
    }
}