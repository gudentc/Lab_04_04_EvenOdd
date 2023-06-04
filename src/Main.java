public class Main
{
    public static void main(String[] args)
    {
        // Declare Variables
        int numToExamine = 2;
        int results;

        System.out.println("Determine if the number is odd or even.");
        System.out.println("The number to examine is " + numToExamine);

        results = numToExamine % 2;

        if (results != 0) {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is even");
        }
    }
}