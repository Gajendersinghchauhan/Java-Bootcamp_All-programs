public class SearchInRotatedArrayWithDuplicates2 {
    public class RotatedSortedArraySearch {
        public static void main(String[] args) {
            int[] nums = {2, 5, 6, 0, 0, 1, 2}; // Example input
            int target = 0; // Example target
            boolean found = search(nums, target);
            System.out.println("Target found: " + found);
        }

        public static boolean search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return true; // Target found
                }

                // Handle duplicates
                if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                    left++;
                    right--;
                } else if (nums[left] <= nums[mid]) { // Left part is sorted
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1; // Target is in the left part
                    } else {
                        left = mid + 1; // Target is in the right part
                    }
                } else { // Right part is sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1; // Target is in the right part
                    } else {
                        right = mid - 1; // Target is in the left part
                    }
                }
            }

            return false; // Target not found
        }
    }

}
