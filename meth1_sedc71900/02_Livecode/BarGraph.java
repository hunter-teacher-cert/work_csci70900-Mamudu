//Created by:
// Lyuba Fridman
// Brian Mueller

public class BarGraph
{
    /***
    barGraphify(nums) takes a list of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index. Exempli gratia, for x = {0,1,2,3}:
    barGraphify(x)
    0:
    1: =
    2: ==
    3: ===
    and for x = {1,0,3,2}
    barGraphify(x)
    0: =
    1:
    2: ===
    3: ==
    barGraphify(nums)
    **/

    public static void barGraphify(int[] nums)
    {
        for(int i=0; i < nums.length; i++)
        {
            System.out.println(i + ": " + "=".repeat(nums[i]));
        }
    }

    public static void main(String []args)
    {
      int[]nums1 = {0,1,2,3}; // provided example
      int[]nums2 = {1,0,3,2}; // provided example
      int[]nums3 = {14,9,0,6,11,1}; // our own example

    barGraphify(nums3);

    }
}
