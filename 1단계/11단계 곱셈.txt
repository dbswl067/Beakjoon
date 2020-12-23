import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c,d,e;
        c = b % 10;
        d = (b / 10) % 10;
        e = (b / 10) / 10;
        System.out.println(c*a);
        System.out.println(d*a);
        System.out.println(e*a);
        System.out.println(b*a);
    }
}