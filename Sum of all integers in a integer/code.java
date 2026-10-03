class Main{
    public static void main(String args[]){
        int n = 3996;
        int total = 0;
        while (n>0)
            {
                total=total+n%10;
                n = (int)n/10;
            }
        System.out.println("Total = "+ total);
    }
}
