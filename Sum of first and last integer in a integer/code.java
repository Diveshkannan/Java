class Main {
    public static void main(String[] args) {
        int n = 3997;
        int last = n%10;
        while (n>9)
            {
                n = (int)n/10;
            }
        int first = n;
        int total = first+last;
        System.out.println("Total = "+total);
    }
}
