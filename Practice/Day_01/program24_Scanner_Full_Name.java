import java.util.Scanner;

class program24_Scanner_Full_Name
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = null;

        scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        sName = scanner.next();

        System.out.println("Welcome "+sName);
    }
}