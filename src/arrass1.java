public class arrass1 {
    public static boolean containduplicate(int nums[]) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("true");
                }

            }

        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        containduplicate(nums);
    }
}