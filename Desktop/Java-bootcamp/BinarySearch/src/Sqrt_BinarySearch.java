/*
The approach of finding square root using binary search is that the square root of any number 'n' lies between 2 to n.
Optimizing it the square root of any number n is necessarily falls between 2 to n/2....
Therefore, it can be considered as a sorted array now we find mid and check by squaring it, that is it equal to the
number n or not... Otherwise we do mid+1 or mid-1 as per the requirnment...
 */

public class Sqrt_BinarySearch {
    public static void main(String[] args) {
        int x = 27;
        int result = mySqrt(x);
        System.out.println(result); // Output: 2
    }
        public static int mySqrt(int x) {
            if (x < 2) {
                return x; // The square root of 0 is 0 and of 1 is 1
            }

            int start = 2;
            int end = x / 2;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long midSquared = (long) mid * mid; // Use long to prevent overflow

                if (midSquared == x) {
                    return mid; // Exact square root found
                } else if (midSquared < x) {
                    start = mid + 1; // Move to the end half
                } else {
                    end = mid - 1; // Move to the start half
                }
            }

            return end; // The largest integer whose square is less than or equal to x
        }

}

