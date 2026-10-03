import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_digits = 0; 
        int even_digits = 0; 
        int odd_digits = 0; 
        System.out.print("Enter a integer: "); 
        String number = sc.next() ;
        int length = number.length();
        int temp = 0;
        for(int i=0;i<length;i++)
            {
            
                 temp = number.charAt(i)-'0';
                if (temp>=0 && temp<=9)
                {
                    if (temp%2==0)
                    {
                        even_digits++;
                    }
                    else
                    {
                        odd_digits++;
                    }
                    count_digits++;
                }
            }
        System.out.println("Total count = "+count_digits);   
        System.out.println("Total even count = "+even_digits); 
        System.out.println("Total odd count = "+odd_digits); 
    }
}
        
