package edu.cnm.deepdive;

/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */

public class CodingBatSumThirteen {

  private static int[] one = {1, 2, 2, 1};
  private static int[] two = {1, 1};
  private static int[] three = {1, 2, 2, 1, 13};

  public static void main(String[] args) {

    System.out.println("for the array [1, 2, 2, 1], the outcome is " + sum13(one) + ".");
    System.out.println("for the array [1, 1], the outcome is " + sum13(two) + ".");
    System.out.println("for the array [1, 2, 2, 1, 13], the outcome is " + sum13(three) + ".");
  }

  public static int sum13(int[] nums) {
    int len = nums.length;
    int sum = 0;

    if (len == 0) {
      return 0;
    }

    for (int i = 0; i < len; i++) {

      if (nums[i] != 13) {
        sum += nums[i];
      }
      else if (nums[i] == 13 && i < len - 1) {
        nums[i] = 0;
        nums[i + 1] = 0;
      }
    }
    return sum;
  }
}
