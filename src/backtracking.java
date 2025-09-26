public class backtracking {
    public static void changeArr(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int arr[] = new int[5];
        //changeArr(arr, 0, 1);
        //printArr(arr);
        String str="abc";
        //findSubsets(str," ",0);
        findPermutation(str," ");
    }

    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()){
            if (ans.isBlank() ) {//it should be zero instead of 1
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
                return;
        }
        findSubsets(str,ans+str.charAt(i),i+1);
        findSubsets(str,ans,i+1);
    }
    public static void findPermutation(String str,String ans){
        if (str.isBlank()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String NewStr=str.substring(0,i)+str.substring(i+1);
            findPermutation(NewStr,ans+curr);
        }
    }
}