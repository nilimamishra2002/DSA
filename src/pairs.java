public class pairs {
    public static void pairs(int numbers[]) {
        int tp=0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
       System.out.println("total pairs="+tp);
    }
    public static void main (String args[]){
        int numbers[]={2,4,5,13,67};
        pairs(numbers);
    }
}
