// Approach 2

import java.util.Scanner;

class program34_Approach2_Instance_Method
{
    public int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public static void main(String A[])
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = scanner.nextInt();

        program34_Approach2_Instance_Method obj = new program34_Approach2_Instance_Method(); iResult = obj.Addition(iValue1, iValue2); // Fixed: non-static method call via object

        System.out.println("Addition is : "+iResult);
    }
}