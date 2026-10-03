import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_digits = 0; 
        int even_digits = 0; 
        int odd_digits = 0; 
        System.out.print("Enter a integer: "); 
        int number = sc.nextInt() 
        while (number >0) { 
            if ((number%10)%2==0)
            { 
                even_digits++; 
            } 
            else 
            { 
                odd_digits++; 
            } count_digits++; 
            number=number/10; 
        } 
        System.out.println("Total count = "+count_digits);             System.out.println("Total even count = "+even_digits);         System.out.println("Total odd count = "+odd_digits); 
    } 
}
