package vn.techmaster;

public class Sum1 {

    private static int Sum1(int arr[], int n) {

        //base or terminating condition
        if (n <= 0) {
            return 0;
        }

        //Calling method recursively
        return Sum1(arr, n-1 ) + arr[n-1];
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 6, 8, 9, 12};
        int sum = Sum1(arr, arr.length);

        System.out.println(sum);
    }

}